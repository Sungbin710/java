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
		super.paintComponent(g); // JPanel에서 원래 수행하는 그리기 작업
		
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
		
		g.drawOval(xLoc,yLoc,2*r,2*r);						// 기본 원
		g.drawLine(xOri,yOri,   (int)a_h, (int)b_h);		// 시침 (Complete)	
		g.drawLine(xOri,yOri,   (int)a, (int)b);			// 분침 (Complete)

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
		setTitle("입력에 따라 아날로그 시계 그리기");
		setSize(600,400);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();  //하나로 묶을곳
		p1 = new JPanel(); //버튼과 텍스트필드
		mp1 = new MyPanel(); //그릴곳
		b1 = new JButton("그리기!");
		t1 = new JTextField(10);
		
		b1.addActionListener(e->{
			String text = t1.getText();
			String [] partial = text.split(":");
			
			if(partial.length == 2){ // xx:xx 형식으로 입력되었다.
				int hour = Integer.parseInt(partial[0]); // 0~24 (0,12,24는 똑같은 동작하도록)
				int min = Integer.parseInt(partial[1]);	 // 0~59
				
				if((hour<=24)&&(hour>=0)&&(min<=59)&&(min>=0)){
					
					double ang_h = (double)hour/12*360 + (double)min / 60 * 15;
					double ang_m = (double)min/60*360;
					
					mp1.setAngle(ang_h , ang_m);
					mp1.repaint();							// MyPanel 다시 그리기
					t1.setText("");							// 입력값은 비워주기
					b1.setBackground(Color.GREEN);			// 성공은 초록색
				} else {
					b1.setBackground(Color.RED);			// 실패는 빨간색(시간 형식 오류)
				}
			} else { // xx:xx 형식으로 입력되지 않았을 경우
				b1.setBackground(Color.RED);			// 실패는 빨간색	
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
