import java.util.*;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {9,4,5,6,2,1};
		Arrays.sort(array);
		printArray(array);
		System.out.println(Arrays.binarySearch(array, 9)); //���� Ž���� ���� 9�� index ã��
		Arrays.fill(array, 8);	//array�� 8�� �� ä��
		printArray(array);
		
	}

	private static void printArray(int[] array) {
		System.out.print("[");
		
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
		System.out.println("]");
	
	}
	 
	
}
