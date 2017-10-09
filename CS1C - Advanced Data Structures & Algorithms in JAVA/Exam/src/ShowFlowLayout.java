import javax.swing.JFrame;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;



public class ShowFlowLayout extends JFrame implements ActionListener{
    private JButton yes;
    private JButton maybe;
    private JButton alright;
    private JButton reset;
    private JButton timeout;
    private JButton ignore;
     
    public ShowFlowLayout(){
    	this.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

        yes = new JButton("Yes");
        yes.setBackground(Color.RED);
        yes.setForeground(Color.RED);
        add(yes);
        yes.addActionListener(this);

        maybe = new JButton("Maybe");
        add(maybe);
        maybe.addActionListener(this);

        alright = new JButton("Alright");
        add(alright);
        alright.addActionListener(this);

        reset = new JButton("Reset");
        add(reset);
        reset.addActionListener(this);

        timeout = new JButton("Timeout");
        add(timeout);
        timeout.addActionListener(this);

        ignore = new JButton("Ignore");
        add(ignore);
        ignore.addActionListener(this);

        this.setTitle("ShowFlowLayout");
        this.setSize(500,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
    	if (evt.getSource() == yes){
    		setBackground(Color.RED);
    	}
    	else if (evt.getSource() == maybe){
            this.setBackground(Color.ORANGE);
    	}
    	else if (evt.getSource() == alright){
            this.setBackground(Color.YELLOW);
    	}
    	else if (evt.getSource() == reset){
            this.setBackground(Color.GREEN);
    	}
    	else if (evt.getSource() == timeout){
            this.setBackground(Color.CYAN);
    	}
    	else if (evt.getSource() == ignore){
            this.setBackground(Color.BLUE);
    	}
    }
    
    public static void main(String[] args) { 
        ShowFlowLayout window;
        window = new ShowFlowLayout();
    }
}