package Examples;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PhoneDialer implements ActionListener{
	// declare variables to hold all of our buttons  at the 
			//class level so we can capture their events later 
			
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonDash;
	JButton dialButton;
	String phoneNumber;

	public static void main(String[] args) {
		new PhoneDialer();
	
	}

	public PhoneDialer() {
		//Craete a new JFRame give it a title and size 
		// set the default close operation to exit on close
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Dialer");
		myFrame.setSize(200,250);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//get the main content pane from the JFrame
		//Establish the overall vertical BoxLayout 
		// Also add an empty space border of 10 pixels on all sides
		JPanel mainPanel = (JPanel)myFrame.getContentPane();
	mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
	mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	//Craete a panel to hold label
	//Give it a flow layout and add the label with prompt text to the panel
	JPanel labelPanel = new JPanel();
	labelPanel.setLayout(new FlowLayout());
	JLabel myLabel= new JLabel("Enter the number to dial");
	labelPanel.add(myLabel);
	//Craete a panel to hold the phone buttons in a 4x3 grid
	//add 5 pixels of space between all cells in the grid
	// Craete a 5-pixels empty space border on all sides
	JPanel buttonPanel = new JPanel();
	buttonPanel.setLayout(new GridLayout(4,3,5,5));
	buttonPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	//Create all of the buttons we need for our phone 
	// assign to the class member variables so we can compare them later in the actiomnPerformed() method
	button1 = new JButton("1");
	button2 = new JButton("2");
	button3 = new JButton("3");
	button4 = new JButton("4");
	button5 = new JButton("5");
	button6 = new JButton("6");
	button7 = new JButton("7");
	button8 = new JButton("8");
	button9 = new JButton("9");
	buttonDash= new JButton("-");
	button0= new JButton("0");
	//Now add buttons to the grid left to right
   // top to buttom so they appear just like a normal phone keypad
	buttonPanel.add(button1);
	buttonPanel.add(button2);
	buttonPanel.add(button3);
	buttonPanel.add(button4);
	buttonPanel.add(button5);
	buttonPanel.add(button6);
	buttonPanel.add(button7);
	buttonPanel.add(button8);
	buttonPanel.add(button9);
	buttonPanel.add(buttonDash);
	buttonPanel.add(button0);
	//now add the top label panel and middle button panel to the main panels vertical box layout
	mainPanel.add(labelPanel);
	mainPanel.add(buttonPanel);
	//Create a new button to let the user dial the number
	// Give it a center allignment and add directly to the main panel
	// so it will appear at the bottom of the vertical box layout
	dialButton = new JButton("Dial Number");
	dialButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	mainPanel.add(dialButton);
	//add"this" PhoneDialer class an action listener to all buttons
	dialButton.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
	buttonDash.addActionListener(this);
	button0.addActionListener(this);
	//finally make our frame visible
	myFrame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
	if (e.getSource()==dialButton) {
		JOptionPane.showMessageDialog(null,"Dialing: " +phoneNumber);
		phoneNumber =  "";
	}
	else if(e.getSource()==button1) {
		phoneNumber = phoneNumber +"1";
		
	}
	else if(e.getSource()==button2) {
		phoneNumber = phoneNumber +"2";
		
	}
	else if(e.getSource()==button3) {
		phoneNumber = phoneNumber +"3";
		
	}
	else if(e.getSource()==button4) {
		phoneNumber = phoneNumber +"4";
		
	}
	else if(e.getSource()==button5) {
		phoneNumber = phoneNumber +"5";
		
	}
	else if(e.getSource()==button6) {
		phoneNumber = phoneNumber +"6";
		
	}
	else if(e.getSource()==button7) {
		phoneNumber = phoneNumber +"7";
		
	}
	else if(e.getSource()==button8) {
		phoneNumber = phoneNumber +"8";
		
	}
	else if(e.getSource()==button9) {
		phoneNumber = phoneNumber +"9";
		
	}
	else if(e.getSource()==button0) {
		phoneNumber = phoneNumber +"0";
		
	}
	else if(e.getSource()==buttonDash) {
		phoneNumber = phoneNumber +"-";
		
	}
	
	}
}
