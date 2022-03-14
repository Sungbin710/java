import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyPanel extends JPanel {
	private double hourangle = 0.0, minangle = 0.0;
	final static int xLoc = 60;
	final static int yLoc = 100;
	final static int r = 70;
	final static int xOri = xLoc + r;
	final static int yOri = yLoc + r;
	
	final static double[] rad = {0/180*Math.PI, 15/180*Math.PI, 30/180*Math.PI,
			45/180*Math.PI, 60/180*Math.PI, 75/180*Math.PI, 90/180*Math.PI,
			105/180*Math.PI, 120/180*Math.PI, 135/180*Math.PI, 150/180*Math.PI,
			165/180*Math.PI
	};
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g); // JPanel���� ���� �����ϴ� �׸��� �۾�
		
		double hourrad = hourangle/180*Math.PI;
		double p_h = r*Math.sin(hourrad);
		double q_h = r*(1-Math.cos(hourrad));
		double a_h = xOri + p_h;
		double b_h = yOri - r + q_h;
		
		double minrad = minangle/180*Math.PI;
		double p = r*Math.sin(minrad);
		double q = r*(1-Math.cos(minrad));
		double a = xOri + p;
		double b = yOri - r + q;
		
		g.drawOval(xLoc,yLoc,2*r,2*r);						// �⺻ ��
		g.drawLine(xOri,yOri,   (int)a_h, (int)b_h);		// ��ħ (Complete)	
		g.drawLine(xOri,yOri,   (int)a, (int)b);			// ��ħ (Complete)

	}
	
	public void setAngle(double hourangle, double minangle){
		this.hourangle = hourangle;
		this.minangle = minangle;
	}
}

class MyFrame extends JFrame {
	private JButton b1;
	private JTextField t1;
	private MyPanel mp1;
	private JPanel p,p1;
	
	public MyFrame (){
		setTitle("�Է¿� ���� �Ƴ��α� �ð� �׸���");
		setSize(600,400);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();  //�ϳ��� ������
		p1 = new JPanel(); //��ư�� �ؽ�Ʈ�ʵ�
		mp1 = new MyPanel(); //�׸���
		b1 = new JButton("�׸���!");
		t1 = new JTextField(10);
		
		b1.addActionListener(e->{
			String text = t1.getText();
			String [] partial = text.split(":");
			
			if(partial.length == 2){ // xx:xx �������� �ԷµǾ���.
				int hour = Integer.parseInt(partial[0]); // 0~24 (0,12,24�� �Ȱ��� �����ϵ���)
				int min = Integer.parseInt(partial[1]);	 // 0~59
				
				if((hour<=24)&&(hour>=0)&&(min<=59)&&(min>=0)){
					
					double ang_h = (double)hour/12*360 + (double)min / 60 * 15;
					double ang_m = (double)min/60*360;
					
					mp1.setAngle(ang_h , ang_m);
					mp1.repaint();							// MyPanel �ٽ� �׸���
					t1.setText("");							// �Է°��� ����ֱ�
					b1.setBackground(Color.GREEN);			// ������ �ʷϻ�
				} else {
					b1.setBackground(Color.RED);			// ���д� ������(�ð� ���� ����)
				}
			} else { // xx:xx �������� �Էµ��� �ʾ��� ���
				b1.setBackground(Color.RED);			// ���д� ������	
			}
		});
		
		p.setLayout(new GridLayout(0,2,5,5));
		p1.setLayout(new GridLayout(0,1,5,5));
		
		p1.add(t1);
		p1.add(b1);
		p.add(p1);
		p.add(mp1);
		add(p);
		
		setVisible(true);
	}
}

public class problem02 {

	public static void main(String[] args) {
		MyFrame fr = new MyFrame();
	}

}
