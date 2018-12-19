package Examples;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
public class SimpleGui {
	JFrame myFrame;
	JPanel contentPane;
	FlowLayout fLayout;
	GridLayout gLayout;
	BorderLayout bLayout;
	BoxLayout xLayout;
	JPanel myPanel;

	public static void main(String[] args) {
	new SimpleGui();
	

	}
public SimpleGui() {
	myFrame = new JFrame();
myFrame .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myPanel = (JPanel)myFrame.getContentPane();
myFrame.setSize(200,200);
myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
JPanel topPanel = new JPanel();
topPanel.setLayout(new FlowLayout());
topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
JLabel myLabel = new JLabel("Whats your favorite fruit?");
topPanel.add(myLabel);
JPanel bottomPanel = new JPanel();
bottomPanel.setLayout(new GridLayout(2,2,2,2));
bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

//buttons that will go in the bottom child JPanel 
bottomPanel.add(new JButton("Apple"));
bottomPanel.add(new JButton("Orange"));
bottomPanel.add(new JButton("Pear"));
bottomPanel.add(new JButton("Bannana"));
myPanel.add(topPanel);
myPanel.add(bottomPanel);
myFrame.setVisible(true);





}
}
