import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Fruit fruit;
		System.out.println("������: 1 , �ٳ���: 2 ?");
		
		int input = scanner.nextInt();
		if(input == 1) {
			fruit = new Peach();
			fruit.show();	
		}
		else {
			fruit = new Banana();
			fruit.show();
		}
	}

}
