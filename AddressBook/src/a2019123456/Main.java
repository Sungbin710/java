package a2019123456;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			AddressBook book = new AddressBook();
			boolean bool = true;
			
			while(bool) {
				System.out.println("=======================");
				System.out.println("1.연락처 입력");
				System.out.println("2.연락처 삭제");
				System.out.println("3.연락처 검색");
				System.out.println("4.연락처 모두 출력");
				System.out.println("5.종료");
				System.out.println("-----------------------");
				System.out.println("명령어 입력:");
				int input = sc.nextInt();
				System.out.println("=======================");
			
				switch(input){
				case 1:
					System.out.print("이름: ");
					String name = sc.next();
					System.out.print("아이디: ");
					String id = sc.next();
					//구현
					Student p = new Student();
					//book.insert(p);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					System.out.println(book); //toString 구현
					break;
				case 5:
					bool = false;
					break;
				default:
					System.out.println("잘못 입력하였습니다.");
				}
			
			}
	}

}
