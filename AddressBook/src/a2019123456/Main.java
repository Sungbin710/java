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
				System.out.println("1.����ó �Է�");
				System.out.println("2.����ó ����");
				System.out.println("3.����ó �˻�");
				System.out.println("4.����ó ��� ���");
				System.out.println("5.����");
				System.out.println("-----------------------");
				System.out.println("��ɾ� �Է�:");
				int input = sc.nextInt();
				System.out.println("=======================");
			
				switch(input){
				case 1:
					System.out.print("�̸�: ");
					String name = sc.next();
					System.out.print("���̵�: ");
					String id = sc.next();
					//����
					Student p = new Student();
					//book.insert(p);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					System.out.println(book); //toString ����
					break;
				case 5:
					bool = false;
					break;
				default:
					System.out.println("�߸� �Է��Ͽ����ϴ�.");
				}
			
			}
	}

}
