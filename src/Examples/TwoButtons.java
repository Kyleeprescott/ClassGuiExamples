package Examples;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TwoButtons implements ActionListener {
	JButton redButton;
	JButton greenButton; 
	JFrame myFrame ;

	public static void main(String[] args) {
		
	    new TwoButtons();

	
	}
	public TwoButtons() {
		JButton button1 = null;
		JButton button2 = null;
		
		//create a new JFrame 
				JFrame myFrame = new JFrame();
				// set the frame title , size ,location 
				myFrame.setTitle("Two Buttons");
				myFrame.setSize(500,150);
				myFrame.setLocation(200 , 300);
				// make sure that program terminates when window is closed 
				myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			   // assign a layout
				FlowLayout mylayout = new FlowLayout();
			    myFrame.setLayout(mylayout);
			    // create and add buttons to the frame 
			    JButton redButton = new JButton("Red");
			    JButton greenButton = new JButton("Green");
			    myFrame.add(redButton);
			    myFrame.add(greenButton);
			    // make frame visible 
			    myFrame.setVisible(true);
			    
	}
	public void actionPrformed(ActionEvent event) {
		Object control = event.getSource();
		
		// if redButton was clicked
		if(control == redButton  ) {
			myFrame.getContentPane().setBackground(Color.red);
			
		}
		// else if greenButton was clicked 
		else if ( control ==greenButton ) {
			myFrame.getContentPane().setBackground(Color.green);
	}
	
		 redButton = new JButton("Red");
		 greenButton = new JButton("Green");
		 myFrame.add(redButton);
		 myFrame.add(greenButton);
		 // link button to our actionPerformed() function 
		 redButton.
		 greenButton. 
		 
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
	}
	
	}


