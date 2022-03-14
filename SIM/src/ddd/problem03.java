import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class panel_03 extends JPanel {
	static int [] Loc = {50, 100, 150, 200, 250, 300, 350, 400, 450, 500, 550};
	static int [] Num = {0,0,0,0,0,0,0,0,0,0,0};
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g); // JPanel���� ���� �����ϴ� �׸��� �۾�
		
	//	g.drawRect(Loc[0], 200 - (int)(Num[0]/(double)200), 40, );
	}
	
	public void set (int [] number){
		for(int i=0; i<number.length; i++){
			Num[i] = number[i];
		}
	}
}

class frame extends JFrame {
	
	JPanel bottom;
	panel_03 main;
	JLabel n0, n1, n2,n3,n4,n5,n6,n7,n8,n9,n10;
	
	public frame (int[] number){
		setTitle("�������");
		setSize(500,500);
		setLocation(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setVisible(true);
	}
}

public class problem03 {

	public static void main(String[] args) throws Exception {
		
		int total = 0;
		int num = 0, num0=0, num10=0, num20=0, num30=0, num40=0, num50=0, num60=0;
		int num70=0, num80=0, num90=0, num100=0;
		int [] number = new int[11]; 
		double avg;
		int max = -1, min = 101;
		// 0���� ���� ���� ���� ������ max�� -1�� �ξ� ù��° ���ں��� max�� ����
		// 100���� ū ���� ���� ������ min�� 101�� �ξ� ù��° ���ں��� min���� ����
		
		try(
				BufferedReader in = new BufferedReader(new FileReader("data.txt"))
				)
		{
			String line;
			while((line = in.readLine()) != null){ // �� 3126��(text), 2���� �� ĭ!!!
				if(line.equals("") == false){
					int val = Integer.parseInt(line);
					
					if(max < val)
						max = val;
					if(min > val)
						min = val;
					total += val;
					
					switch(val/10){
					case 0:
						num0++;
						break;
					case 1:
						num10++;
						break;
					case 2:
						num20++;
						break;
					case 3:
						num30++;
						break;
					case 4:
						num40++;
						break;
					case 5:
						num50++;
						break;
					case 6:
						num60++;
						break;
					case 7:
						num70++;
						break;
					case 8:
						num80++;
						break;
					case 9:
						num90++;
						break;
					case 10:
						num100++;
						break;
					}	
					num++;
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		avg = (double) total / num;
		
		number[0] = num0;
		number[1] = num10;
		number[2] = num20;
		number[3] = num30;
		number[4] = num40;
		number[5] = num50;
		number[6] = num60;
		number[7] = num70;
		number[8] = num80;
		number[9] = num90;
		number[10] = num100;
		
		frame fr = new frame(number);
		
		System.out.println("��ȿ�ټ�:"+num);
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
		System.out.println("�ְ�:"+max);
		System.out.println("����:"+min);
		System.out.println("0~9��"+num0);
		System.out.println("10~19��"+num10);
		System.out.println("20~29��"+num20);
		System.out.println("30~39��"+num30);
		System.out.println("40~49��"+num40);
		System.out.println("50~59��"+num50);
		System.out.println("60~69��"+num60);
		System.out.println("70~79��"+num70);
		System.out.println("80~89��:"+num80);
		System.out.println("90~99��:"+num90);
		System.out.println("100��:"+num100);
	}
}
