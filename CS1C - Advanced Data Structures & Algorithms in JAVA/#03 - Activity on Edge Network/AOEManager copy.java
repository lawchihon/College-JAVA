/*********************************************************************
 Project: Task Manager

 *********************************************************************/

import java.sql.Struct;
import java.util.*;
import java.util.List;
import java.awt.*;

public class AOEManager {
	private Vector vVertex; // Set of Event
	private Vector vEdge; // Set of Edge

	private WeightedDirectedGraph graph;

	private VectorStack stack;

	private boolean isTesting = true; // Turn Testing On and Off

	public AOEManager() {
		vVertex = new Vector();
		vEdge = new Vector();
	}

	// Draw the activity network
	public void draw(Graphics g) {

		for (int i = 0; i < vVertex.size(); i++)
			((Vertex) vVertex.elementAt(i)).draw(g);

		for (int i = 0; i < vEdge.size(); i++)
			((Edge) vEdge.elementAt(i)).draw(g);
	}

	public void addVertex(int x, int y, int id) {

		vVertex.add(new Vertex(x, y, id));
	}

	public void addEdge(Vertex v1, Vertex v2, int timeActivity, int iDedge) {
		vEdge.add(new Edge(v1, v2, timeActivity, iDedge));
	}

	// Return a specific Vertex if x and y are within the circle
	public Vertex findVertex(int x, int y) {
		for (int i = 0; i < vVertex.size(); i++) {
			if (((Vertex) vVertex.elementAt(i)).isInclude(x, y)) {

				return (Vertex) vVertex.elementAt(i);
			}
		}
		return null;
	}

	// Return a specific Vertex if the point are along the Edge
	public Edge findEdge(Point pt) {
		for (int i = 0; i < vEdge.size(); i++) {
			if (((Edge) vEdge.elementAt(i)).isInclude(pt)) {

				return (Edge) vEdge.elementAt(i);
			}
		}
		return null;
	}

	public void criticalPath() {
		if (vVertex.isEmpty())
			return;

		// Missing Code
		// Task 2.1 in the Dialog Message

		graph = new WeightedDirectedGraph(vVertex.size());
		for (int i = 0; i < vEdge.size(); i++) {
			int source = ((Edge) vEdge.elementAt(i)).getSource();
			int target = ((Edge) vEdge.elementAt(i)).getDestination();
			int weight = ((Edge) vEdge.elementAt(i)).getTime();
			graph.addEdge(source, target, weight);
		}

		forwardStage();

		// Missing Code
		// Task 2.3 in the Dialog Message

		for (int i = 0; i < vVertex.size(); i++) {
			if (graph.getSuccesors(i).length == 0) {
				((Vertex) vVertex.elementAt(i))
						.setLatestEvent(((Vertex) vVertex.elementAt(i))
								.getEarliestEvent());
			}
		}

		backwardStage();

	}

	public void forwardStage() {

		// Missing Code
		int top = -1;
		stack = new VectorStack();
		int length = 0;

		// create a linked stack of
		for (int i = 0; i < vVertex.size(); i++) {
			if (graph.getPredecessors(i).length == 0) {
				stack.push(i);
				length = graph.getSuccesors(i).length;
				top = i;
			}
		}

		for (int i = 0; i < vVertex.size(); i++) {
			if (top == -1) {
				System.out.println("network has a cycle");
				return;
			} else {
				// unstack a vertex

				top = (Integer) stack.pop();

				length = graph.getSuccesors(top).length;
				int[] p = new int[length];
				p = graph.getSuccesors(top);

				int k = 0;
				while (length != 0) {
					// decrease the count of the successor vertices of start
					int next = p[k];

					if (((Vertex) vVertex.elementAt(next)).getEarliestEvent() < (((Vertex) vVertex
							.elementAt(top)).getEarliestEvent() + graph
							.getWeight(top, next))) {
						((Vertex) vVertex.elementAt(next))
								.setEarliestEvent(((Vertex) vVertex
										.elementAt(top)).getEarliestEvent()
										+ graph.getWeight(top, next));
					}
					length--;

					stack.push(next);
					if (length == 0) {
						top = next;
					}
					if (length != 0) {
						k++;
					} else
						break;
					// end while
				}

			}
		}

		testing(isTesting);

	}

	public void backwardStage() {

		// Missing Code ;

		// set latest event time for all event to project duration
		int latest = 0;
		for (int i = 0; i < vVertex.size(); i++) {
			if (graph.getSuccesors(i).length == 0) {
				latest = i;
			}
		}
		for (int i = 0; i < vVertex.size(); i++) {
			((Vertex) vVertex.elementAt(i)).setLatestEvent(((Vertex) vVertex
					.elementAt(latest)).getLatestEvent());
		}

		// insert last event into Stack
		stack.push(latest);
		
		// while Stack Not Empty
		while (!stack.empty()) {
			int top = (Integer) stack.pop();
			int length = graph.getPredecessors(top).length;
			int[] p = new int[length];
			p = graph.getPredecessors(top);

			int k = 0;
			while (length != 0) {
				int next = p[k];

				if (((Vertex) vVertex.elementAt(next)).getLatestEvent() > (((Vertex) vVertex
						.elementAt(top)).getLatestEvent() - graph
						.getWeight(next, top))) {
					((Vertex) vVertex.elementAt(next))
							.setLatestEvent(((Vertex) vVertex
									.elementAt(top)).getLatestEvent()
									- graph.getWeight(next, top));
				}
				
				length--;

				stack.push(next);
				if (length == 0) {
					top = next;
				}
				if (length != 0) {
					k++;
				} else
					break;
				// end while
			}

		}

		testing(isTesting);

	}

	public void resetEarlyLateTime() {
		for (int i = 0; i < vVertex.size(); i++) {
			Vertex current = (Vertex) vVertex.elementAt(i);
			current.reset();

		}

	}

	public void testing(boolean testing) {
		if (testing) {

			System.out.println("Testing Forward Stage");

			for (int i = 0; i < vVertex.size(); i++) {
				Vertex vtry = ((Vertex) vVertex.elementAt(i));
				System.out.println(vtry.getEarliestEvent());
			}

			System.out.println("Testing BackWard Stage");

			for (int i = 0; i < vVertex.size(); i++) {
				Vertex vtry = ((Vertex) vVertex.elementAt(i));
				System.out.println(vtry.getLatestEvent());
			}
		}
	}
}
