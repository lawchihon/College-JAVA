import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
public class MyFrame extends JFrame implements ActionListener{
	private JLabel prompt;
	private JButton hello;
	private JButton goodbye;
	private JTextField userNameField;
	
	private void initialize(){
		userNameField = new JTextField("Type your name here: ", 20);
		this.add(userNameField);
		this.setLayout(new FlowLayout());
		hello = new JButton("Hello");
		add(hello);
		hello.addActionListener(this);
		goodbye = new JButton("Goodbye");
		add(goodbye);
		goodbye.addActionListener(this);
		prompt = new JLabel("Hello, world!");
		this.add(prompt);
		this.setSize (300,200);
		this.setTitle("Hello World!");
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	public MyFrame(){
		this.initialize();
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		String name = userNameField.getText();
		if (prompt != null){
			this.remove(prompt);
			this.repaint();
		}
		if (evt.getSource() == hello ){ 
			prompt = new JLabel("Hello, " + name + "!") ;
			this.add(prompt);
			}
		else{
			prompt = new JLabel("Goodbye, " + name + "!");
			this.add(prompt);
			}
			validate();
	}
}
