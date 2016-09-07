package sorting;

public class BubbleSortingTest {

	public static void main(String[] args) {
		int[] arr = {11, 2, 5, 4, 10, 8};
		int length = arr.length;
		
		BubbleSorting bs = new BubbleSorting(length,arr);
		
		arr = bs.Sorting();
		
		for(int num : arr){
			System.out.print(num + " ");
		}
	}

}
