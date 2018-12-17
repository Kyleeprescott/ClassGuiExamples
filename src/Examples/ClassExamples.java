package Examples;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ClassExamples implements ActionListener {

	public static void main(String[] args) {
		new ClassExamples();	
	}
	public  ClassExamples() {
		JFrame frame = new JFrame();
	    FlowLayout layout = new FlowLayout();
	    frame.setLayout(layout);
	    frame.setTitle("simple window");
	    frame.setSize(400,200);
	    frame.setLocation( 200 , 300);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    
	JLabel label = new JLabel("This is my label!");
	frame.add(label);

	JButton button = new JButton("Click me");
	frame.add(button);
	button.setEnabled(true);
	frame.pack();
	button.addActionListener(this);
	

		
	}
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null , "Hey that tickles");
		
	}

}
