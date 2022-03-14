import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		setTitle("FlowLayout");
		setSize(300,150);
		setLayout(new FlowLayout());
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyFrame f = new MyFrame();
	}

}
