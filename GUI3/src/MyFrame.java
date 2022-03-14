import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		setTitle("GridLayoutTest");
		setSize(300, 150);
		setLayout(new GridLayout(0,3));
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyFrame J = new MyFrame();
	}

}
