package Searching;

public class BinarySearcingTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int key = 8;
		
		BinarySearching bs = new BinarySearching(arr.length);
		
		System.out.println("Key�� ���°�� ��ġ? >> " + bs.Serach(key, arr) + "��°");
	}

}
