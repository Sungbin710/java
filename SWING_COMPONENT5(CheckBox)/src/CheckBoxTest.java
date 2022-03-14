import java.awt.*;
import javax.swing.*;

public class CheckBoxTest extends JFrame{

	public CheckBoxTest() {
		setTitle("CheckBox Test");
		setSize(500, 150);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JCheckBox checkbox1 = new JCheckBox("���", true);
		JCheckBox checkbox2 = new JCheckBox("�ٳ���");
		JCheckBox checkbox3 = new JCheckBox("����", true);
		JCheckBox checkbox4 = new JCheckBox("������");
		JCheckBox checkbox5 = new JCheckBox("��", true);
		
		panel.setBorder(BorderFactory.createTitledBorder("����"));
		
		panel.add(checkbox1);
		panel.add(checkbox2);
		panel.add(checkbox3);
		panel.add(checkbox4);
		panel.add(checkbox5);
		
		add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxTest();
	}

}
