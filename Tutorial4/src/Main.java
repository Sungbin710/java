
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Archer archer1 = new Archer("±Ã¼ö1", "»ó");
		Archer archer2 = new Archer("±Ã¼ö1", "»ó");
		
		System.out.println(archer1 == archer2);
		System.out.println(archer1.equals(archer2));
	}

}
