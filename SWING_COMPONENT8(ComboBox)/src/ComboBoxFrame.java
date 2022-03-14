import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxFrame extends JFrame implements ActionListener{

	JLabel label;
	
	public ComboBoxFrame() {
		setTitle("�޺��ڽ�");
		setSize(400, 200);
		
		String[] animals = {"dog", "cat", "bird"};
		JComboBox animalList = new JComboBox(animals);
		animalList.setSelectedIndex(0);
		animalList.addActionListener(this);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		changePicture(animals[animalList.getSelectedIndex()]);
		add(animalList, BorderLayout.NORTH);
		add(label, BorderLayout.CENTER);
		setVisible(true);	
	}

	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
		String name = (String)cb.getSelectedItem();
		changePicture(name);
	}
	
	public void changePicture(String name) {
		ImageIcon icon = new ImageIcon("C:\\Users\\SBLEE\\"+name+".jpg");
		label.setIcon(icon);
		if(icon != null) {
			label.setText(null);;
		}else {
			label.setText("�̹����� �߰ߵ��� �ʾҽ��ϴ�.");
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboBoxFrame frame = new ComboBoxFrame();
	}

}
