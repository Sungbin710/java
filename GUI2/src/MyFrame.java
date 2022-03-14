import javax.swing.*;
import java.awt.FlowLayout;


public class MyFrame extends JFrame{

		public MyFrame(){
			setSize(300, 200);
			setTitle("My Frame");
			
			setLayout(new FlowLayout());		// 레이아웃 매니저 지정 (default는 Center)
			JButton button = new JButton("버튼");
			add(button);
			setVisible(true);
			
		}
		public static void main(String[] args) {
			MyFrame J = new MyFrame();
		}
}
