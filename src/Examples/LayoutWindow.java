package Examples;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

public class LayoutWindow {
JFrame myFrame;
JPanel contentPane;
FlowLayout fLayout;
GridLayout gLayout;
BorderLayout bLayout;
BoxLayout xLayout;
JPanel myPanel;



	public static void main(String[] args) {
		new LayoutWindow();

	}
	public LayoutWindow() {
		// make new  frame object
	 myFrame = new JFrame();
	 fLayout = new FlowLayout();
	 gLayout = new GridLayout(3,2);
	 gLayout.setHgap(5);
	 gLayout.setVgap(10);
	 bLayout = new BorderLayout(5,10);
	 xLayout = new BoxLayout(myPanel,BoxLayout.X_AXIS);
	 Border myBorder  = BorderFactory.createLineBoarder(4);
	 myPanel.setBorder(myBorder);
	 
	 // Jpane set up 
	 //contentPane = (Jpanel) myFrame .getContentPane();

myPanel = new JPanel();
	 myFrame.setContentPane(myPanel);
	 myFrame.setTitle("Layout Window Example=");
	 myFrame.setSize(400 , 200);
	 myFrame.setLocation(200 , 300);
	 myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 //set up layout
	 myPanel.setLayout(xLayout);
	 
	 //adding things to the JPane 
	 JLabel label = new JLabel ("JPanel(content pane)");
	 

	 myPanel.setLayout(new FlowLayout());
	JButton button1 = new JButton("Apple");
	myPanel.add(button1);
	 myPanel.add(new JButton("Orange"));
	 myPanel.add(new JButton("Pear"));
	 myPanel.add(new JButton("Bannana"));
	 myPanel.add(new JButton("Pineapple"));
	 
	 
	 myFrame.setVisible(true); 
	 
	 
	 
	
	}

}
