import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame{

	public MyFrame() {
		setSize(300,150);
		setLocation(200,300);
		setTitle("MyFrame");

		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.yellow);
		JButton button1 = new JButton("Ȯ��");
		JButton button2 = new JButton("���");
		add(button1);
		add(button2);
		setVisible(true);
	}
		
	public static void main( String[] args) {
		// TODO Auto-generated method stub
	
		MyFrame f = new MyFrame();
	}
  
}
