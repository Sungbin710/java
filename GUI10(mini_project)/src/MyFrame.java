import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	private String[] labels = {"Backspace","","","CE","C","7","8","9","/","sqrt","4","5","6","x","%","1","2","3","-","1/x","0","+/-","."
,"+","="};	
	public MyFrame() {
		
		setSize(600,300);
		
		JPanel panel_above = new JPanel();
		JPanel panel = new JPanel();
		JButton[] buttons = new JButton[25];
		
		panel.setLayout(new GridLayout(0,1,3,3));
		panel.setLayout(new GridLayout(0,5,3,3));
		
		int index = 0;
		for(int rows = 0; rows<5 ; rows++ ) {
			for(int cols = 0; cols<5 ; cols++) {
				buttons[index] = new JButton(labels[index]);
				
				panel.add(buttons[index]);
				
				index++;
			}
		}
		
		
		
		JTextField field1 = new JTextField(10);
		
		panel_above.add(field1);
		

		add(panel_above);
		add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}
