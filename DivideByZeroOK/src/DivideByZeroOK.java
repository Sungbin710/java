import java.util.*;
public class DivideByZeroOK {

	public static void main(String[] args) {

		int x,y;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		do{
		
		System.out.print("������: ");
		x = sc.nextInt();
		System.out.print("����: ");
		y = sc.nextInt();
		
			try {
				int result = x/y;
			}catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
				cnt++;
				if(cnt<3)
					System.out.println("���α׷��� ��� ����˴ϴ�.");
				
			}
					
		}while(cnt>0 && cnt<3);
		
		
		if(cnt == 3)
			System.out.println("���� �߻�!");
		else
			System.out.println("���α׷��� ����˴ϴ�.");
		
	}

}
