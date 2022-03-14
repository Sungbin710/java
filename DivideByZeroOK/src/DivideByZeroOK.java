import java.util.*;
public class DivideByZeroOK {

	public static void main(String[] args) {

		int x,y;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		do{
		
		System.out.print("피젯수: ");
		x = sc.nextInt();
		System.out.print("젯수: ");
		y = sc.nextInt();
		
			try {
				int result = x/y;
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				cnt++;
				if(cnt<3)
					System.out.println("프로그램은 계속 진행됩니다.");
				
			}
					
		}while(cnt>0 && cnt<3);
		
		
		if(cnt == 3)
			System.out.println("오류 발생!");
		else
			System.out.println("프로그램이 종료됩니다.");
		
	}

}
