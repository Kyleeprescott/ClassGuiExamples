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
		
		//create a new JFrame 
				myFrame = new JFrame();
				// set the frame title , size ,location 
				myFrame.setTitle("Two Buttons");
				myFrame.setSize(500,150);
				myFrame.setLocation(200 , 300);
				// make sure that program terminates when window is closed 
				myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			   // assign a layout
				//FlowLayout mylayout = new FlowLayout();
				//GridLayout myLayout = new GridLayout(3,2);
				//JPanel myPanel = (JPanel)myFrame.getContentPane();
				//BoxLayout myLayout = new BoxLayout(myPanel ,BoxLayout.Y_AXIS);
				BorderLayout myLayout = new BorderLayout();
				
				
				
			    myFrame.setLayout(myLayout);
			    // create and add buttons to the frame 
			    redButton = new JButton("Red");
			    greenButton = new JButton("Green");
				greenButton.addActionListener(this);
				redButton.addActionListener(this);
			    myFrame.add(redButton,BorderLayout.LINE_START);
			  //  myFrame.add(new JLabel(""));
			   // myFrame.add(new JLabel(""));
			   // myFrame.add(new JLabel(""));
			    //myFrame.add(new JLabel(""));
			   myFrame.add(greenButton ,BorderLayout.LINE_END);
			    // make frame visible 
			    myFrame.setVisible(true);
			    
	}


	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();
		
		// if redButton was clicked
		if(control == redButton  ) {
			myFrame.getContentPane().setBackground(Color.red);
			
		}
		// else if greenButton was clicked 
		else if ( control ==greenButton ) {
			myFrame.getContentPane().setBackground(Color.green);
		
	}

	
	
	}

}
