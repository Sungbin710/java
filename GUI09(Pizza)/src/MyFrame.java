import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		JButton b1 = new JButton("콤보피자");
		JButton b2 = new JButton("포테이토피자");
		JButton b3 = new JButton("불고기피자");
		JLabel label2 = new JLabel("개수");
		JTextField field1 = new JTextField(10);
		
	
		panelA.add(label1);
		panelB.add(b1);
		panelB.add(b2);
		panelB.add(b3);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			MyFrame f = new MyFrame();
	}

}
