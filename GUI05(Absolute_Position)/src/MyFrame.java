import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	private JButton b1,b2;
	
	public MyFrame() {
		setTitle("Absolute Position");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setLayout(null);
		
		b1 = new JButton("Button #1");
		add(b1);
		b1.setLocation(10, 30);
		b1.setSize(90,20);
		
		b2 = new JButton("Button #2");
		add(b2);
		b2.setLocation(100,30);
		b2.setSize(90,20);
		setVisible(true);
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			MyFrame F = new MyFrame();
	}

}
