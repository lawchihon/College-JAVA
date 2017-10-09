import java.awt.*;
import java.applet.*;

public class ICLLogic extends Applet {
	private int dimension = 2;
	/*
	 * This is the 2D array where the numbers are going to be saved. You will
	 * use this array in both labelBreadth and labelDepth
	 */
	private int[][] pixels;

	private final static int PIXELDIM = 18;

	private final static int CURRENTPIXEL = 1;
	private final static int CHECKPIXEL = 2;
	private final static int ADDDATASTRUCTURE = 3;

	boolean depthFirst; // Is it depth first or breadth first?

	private int delay = 250;

	private int state = 0;

	// This is the queue to be used in labelBreadth
	// ArrayQueue q = new ArrayQueue(20);
	// This is the stack to be used in labelDepth
	// ArrayStack s = new ArrayStack(255);

	// holds the random color.
	private Color randomColor;

	public ICLLogic(boolean depthFirst) {
		this.depthFirst = depthFirst;
	}

	private void setDimension(int dimension) {
		this.dimension = dimension;
	}

	/* This method is responsible of drawing the squares */
	public void generateImage(int dimension) {
		this.setDimension(dimension);
		pixels = new int[dimension + 2][dimension + 2];
		for (int i = 0; i < dimension + 1; i++) {
			pixels[0][i] = pixels[dimension + 1][i] = 0; // bottom and top
			pixels[i][0] = pixels[i][dimension + 1] - 0; // left and right

		}

		for (int i = 1; i <= dimension; i++) {
			for (int j = 1; j <= dimension; j++) {
				pixels[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public void draw(Graphics g) {
		if (pixels != null) {
			for (int i = 1; i <= dimension; i++) {
				for (int j = 1; j <= dimension; j++) {

					drawPixel(g, i, j, pixels[i][j]);

				}
			}
		}

	}

	/*
	 * This method is responsible for coloring the square and labelling each one
	 * with a number. You will need this method also in labelDepth and
	 * labelbreadth since it also sets the color of each square.
	 */
	public void drawPixel(Graphics g, int x, int y, int number) {
		/*
		 * The color is not fully random..Re-implement it so it becomes fully
		 * random
		 */

		Color current;

		if (number != 0 && number != 1)
			current = randomColor;
		else
			current = Color.gray;

		g.setColor(current);
		g.fillRect(x * PIXELDIM, y * PIXELDIM, PIXELDIM, PIXELDIM);

		current = Color.black;
		g.setColor(current);

		g.drawRect(x * PIXELDIM, y * PIXELDIM, PIXELDIM, PIXELDIM);
		String str = new String("" + number); // writes the number on the square
		g.drawString(str, x * PIXELDIM + PIXELDIM / 4, y * PIXELDIM + 2
				* PIXELDIM / 3);

	}

	public void labelDepth(Graphics g, int Dimension) {
		/*
		 * Enter here the code for the Depth First method. This method will
		 * later be called in class CanvasResult. The Dimension attribute it
		 * takes is the dimension value set by the user. You do not need to
		 * worry about how this value will be set.
		 */

		// Initialize the state
		state = 0;

		// Search by depth first
		for (int y = 1; y <= Dimension; y++) {
			for (int x = 1; x <= Dimension; x++) {

				if (pixels[x][y] == 1) {

					// Set a new random color
					this.setRandomColor();

					ArrayStack path = new ArrayStack(255);

					// Initialize the artificial wall
					this.initializeWall(Dimension);

					// Initialize offsets
					Position[] offset = this.initializeOffset();

					Position here = new Position(x, y);
					pixels[x][y] = CHECKPIXEL + state; // prevent return to
														// entrance

					// Repaint the graphic
					drawPixel(g, x, y, pixels[x][y]);

					// Delay the time before next repaint
					this.delay();

					int option = 0; // next move
					int lastOption = 3;

					// Search for a path
					do {
						// find a neighbor to move to won't compile without
						// explicit initialization
						int r = x, c = y; // row and column of neighbor
						while (option <= lastOption) {
							r = here.row + offset[option].row;
							c = here.col + offset[option].col;
							if (pixels[r][c] == CURRENTPIXEL)
								break;
							option++; // next option
						}

						// Check whether a neighbor is found?
						if (option <= lastOption) // yes
						{
							// Move to pixels[r][c]
							path.push(here);
							here = new Position(r, c);

							// Set to number to prevent revisit
							pixels[r][c] = CHECKPIXEL + state;

							// Delay the time before next repaint
							this.delay();

							// Repaint the graphic
							drawPixel(g, r, c, pixels[r][c]);

							option = 0;
						}

						else {
							// no neighbor to move to, back up
							if (path.empty()) {
								break; // no place to back up to, so we break
										// the loop
							}
							Position next = (Position) path.pop();
							if (next.row == here.row)
								option = 2 + next.col - here.col;
							else
								option = 3 + next.row - here.row;
							here = next;
						}
					} while (true); // Keep the loop until it is completely
									// empty

					state++;
				}
			}
		}

	}

	public void labelBreadth(Graphics g, int Dimension) {
		/*
		 * Enter here the code for the breadth first method. This method will
		 * later be called in class CanvasResult. The Dimension attribute it
		 * takes is the dimension value set by the user. You do not need to
		 * worry about how this value will be set.
		 */

		// Initialize the state
		state = 0;

		// Initialize the artificial wall
		this.initializeWall(Dimension);

		// Initialize offsets
		Position[] offset = this.initializeOffset();

		// Search by breadth first
		for (int x = 1; x <= Dimension; x++) {
			for (int y = 1; y <= Dimension; y++) {
				if (pixels[x][y] == 1) {

					// Set a new random color
					this.setRandomColor();

					Position here = new Position(x, y);
					pixels[x][y] = CHECKPIXEL + state; // block

					// Repaint the graphic
					drawPixel(g, x, y, pixels[x][y]);

					// Delay the time before next repaint
					this.delay();

					int numOfNbrs = 4; // neighbors of a grid position

					// label reachable grid positions
					ArrayQueue q = new ArrayQueue(25);
					Position nbr = new Position(0, 0);
					do {

						// Label neighbors of ‘here’
						for (int i = 0; i < numOfNbrs; i++) {

							// Check out neighbors of ‘here’
							nbr.row = here.row + offset[i].row;
							nbr.col = here.col + offset[i].col;
							if (pixels[nbr.row][nbr.col] == 1) {

								// unlabeled nbr, label it
								pixels[nbr.row][nbr.col] = CHECKPIXEL + state;

								// Repaint the graphic
								drawPixel(g, nbr.row, nbr.col,
										pixels[nbr.row][nbr.col]);

								// Delay the time before next repaint
								this.delay();

								// enqueue – put on queue for later expansion
								q.put(new Position(nbr.row, nbr.col));
							}
						}

						// finish not reached, check whether we can move to a
						// nbr
						if (q.isEmpty())
							break; // no path to move, so we break the loop

						// dequeue next position
						here = (Position) q.remove();

					} while (true);

					state = state + 1;
				}
			}
		}

	}

	// Initialize the artificial wall
	private void initializeWall(int Dimension) {
		for (int i = 0; i <= Dimension + 1; i++) {
			pixels[0][i] = pixels[Dimension + 1][i] = 0; // bottom and top
			pixels[i][0] = pixels[i][Dimension + 1] = 0; // left and right
		}
	}

	// Initialize offsets
	private Position[] initializeOffset() {
		Position[] offset = new Position[4];
		offset[0] = new Position(0, 1); // right
		offset[1] = new Position(1, 0); // down
		offset[2] = new Position(0, -1); // left
		offset[3] = new Position(-1, 0); // up
		return offset;
	}

	// Set a new random color
	private void setRandomColor() {
		randomColor = new Color((int) (Math.random() * 256),
				(int) (Math.random() * 256), (int) (Math.random() * 256));
	}

	// Delay the time
	private void delay() {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}