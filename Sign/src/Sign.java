import java.util.*;

class User{
		public static int count = 0;
		
		String ID;
		String PW;
		int num;
		
		public User(String I,String P) {
			ID = I;
			PW = P;
			num = count++;
			
		}
		
		public void Print() {			
				System.out.println("{ID: " + this.ID + " PW: " + this.PW + "}");
		}
	
}	
	
		

public class Sign{	
	
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		ArrayList<User> Student = new ArrayList<>();	
		
		
		int num; 
		do {
			
			System.out.println("============");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("============");
			
			System.out.print("��ȣ�� �Է��Ͻÿ� : ");
			
			num = input.nextInt();
			input.nextLine();
			
			switch(num) {
			case 1:
				System.out.print("ID:");
				String ID = input.nextLine();
				
				//System.out.println("");
				
				System.out.print("PW:");
				String PW = input.nextLine();
				User u = new User(ID,PW);
				Student.add(u);
				break;
			case 2:
				System.out.print("ID:");
				String ID2 = input.nextLine();
				
				//System.out.println("");
				
				System.out.print("PW:");
				String PW2 = input.nextLine();
				
				int i;
				for(i = 0; i < Student.size(); i++) {
					if(Student.get(i).ID.equals(ID2)) { 
						break;
					}
				}
				
				if( i <= Student.size()-1) {
					if(Student.get(i).PW.equals(PW2)) 
						System.out.println("�α��� �Ǿ����ϴ�.");	
					else
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				else
					System.out.println("���̵� �����ϴ�.");
				
				break;
			case 3:
				for(User u2 : Student)
					u2.Print();
				
				System.out.println("�� " + User.count + "�� �Դϴ�.");
				break;
			case 4:
				break;
			default:
				System.out.print("1~4���� �Է����ּ���");
				break;
			
			}			
	
		}while(num != 4);
		
		System.out.print("���α׷��� ����Ǿ����ϴ�.");
		
	}



}
