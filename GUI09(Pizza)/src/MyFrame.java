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
		
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		JButton b1 = new JButton("�޺�����");
		JButton b2 = new JButton("������������");
		JButton b3 = new JButton("�Ұ������");
		JLabel label2 = new JLabel("����");
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
