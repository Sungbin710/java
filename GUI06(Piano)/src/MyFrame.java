import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("My Piano");
		setSize(610, 300);
		setLayout(null);
		
		for(int i=0; i<10 ; i++) {
			JButton button = new JButton("C" + i);
			button.setLocation(i*60, 100);
			button.setSize(50,150);
			add(button);
		}
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame f = new MyFrame();
	}

}
