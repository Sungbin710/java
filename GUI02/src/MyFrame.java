import javax.swing.*;
import java.awt.FlowLayout;


public class MyFrame extends JFrame{

		public MyFrame(){
			setSize(300, 200);
			setTitle("My Frame");
			
			setLayout(new FlowLayout());		// ���̾ƿ� �Ŵ��� ���� (default�� Center)
			JButton button = new JButton("��ư");
			add(button);
			setVisible(true);
			
		}
		public static void main(String[] args) {
			MyFrame J = new MyFrame();
		}
}
