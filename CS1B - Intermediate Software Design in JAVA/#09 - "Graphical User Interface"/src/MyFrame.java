import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * One object of class MyFrame build a window to convert between temperatures in fahrenheit and temperatures in celcius
 * @author johnlaw
 */
public class MyFrame extends JFrame implements ActionListener{
	private JLabel prompt;
	private JButton fahrenheit;
	private JButton celcius;
	private JTextField userNameField;
	/**
	 * Initialize the screen of window that the user will see
	 */
	private void initialize(){
		userNameField = new JTextField("Type temperatures here: ", 20);
		this.add(userNameField);
		this.setLayout(new FlowLayout());
		fahrenheit = new JButton("Convert to fahrenheit");
		add(fahrenheit);
		fahrenheit.addActionListener(this);
		celcius = new JButton("Convert to celcius");
		add(celcius);
		celcius.addActionListener(this);
		this.setSize (1000,60);
		this.setTitle("Convert Temperature!");
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	/**
	 * Supplies default screen of the window
	 */
	public MyFrame(){
		this.initialize();
	}
	/**
	 * Sets the function of the button
	 */
	public void actionPerformed(ActionEvent evt) {
		String temperature = userNameField.getText();
		double convertedtemperature;
		if (prompt != null){
			this.remove(prompt);
			this.repaint();
		}
		try{
			if (evt.getSource() == fahrenheit ){ 
				convertedtemperature = ((double)5/9)*(Double.parseDouble(temperature)-32);
				temperature = ""+ convertedtemperature;
				prompt = new JLabel(temperature) ;
				this.add(prompt);
			}
			else{
				convertedtemperature = ((double)9/5*Double.parseDouble(temperature))+32;
				temperature = ""+ convertedtemperature;
				prompt = new JLabel(temperature);
				this.add(prompt);
			}
		}
		catch (Exception e){
			prompt = new JLabel("Please input the number!");
			this.add(prompt);
		}
		validate();
	}
}