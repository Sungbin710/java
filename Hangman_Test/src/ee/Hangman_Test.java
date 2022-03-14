package ee;
import java.util.Scanner;

class Hangman{
	
		String str;
		String find = "_____";
		int cnt = 0;
		
		public Hangman(String str) {
			this.str = str;
		}
		
		public void print() {
			System.out.println(find);
		}
	
		public void Comp(char c) {
			cnt ++;
			String sub_str;
			for(int i=0;i<this.str.length();i++) {
				if(str.charAt(i) == c) {
					
					if(i==0) 
						sub_str = c + str.substring(1);
					else if(i==str.length()-1)
						sub_str = str.substring(0,str.length()-1);
					else
						sub_str = str.substring(0,i-1) + c + str.substring(i+1,str.length()-1);
				
					str = sub_str;
				}
			}

		}
		
}

public class Hangman_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char correct;
		Scanner input = new Scanner(System.in);
		
		Hangman H = new Hangman("count");
		
		correct = input.next().charAt(0);
		H.Comp(correct);
		
		H.print();
	
	
	}

}
