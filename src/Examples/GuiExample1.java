package Examples;
import java.awt.*;
import javax.swing.*;

public class GuiExample1 {

	public static void main(String[] args) {
	
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
JButton button1 = new JButton("Red");
frame.add(button1);
button.setEnabled(true);
frame.pack();
JButton button2 = new JButton("Green");
frame.add(button2);
button.setEnabled(true);
frame.pack();
JButton button3 = new JButton("Purple");
frame.add(button3);
button.setEnabled(true);
frame.pack();
JButton button4 = new JButton("Blue");
frame.add(button4);
button.setEnabled(true);
frame.pack();





	}

}
