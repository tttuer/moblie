package sorting;

public class BubbleSorting {
	private int length;
	private int[] arr;
	
	public BubbleSorting(){
		this.length = 0;
		this.arr = null;
	}
	
	public BubbleSorting(int length,int[] arr){
		this.length = length;
		this.arr = arr;
	}
	
	public int[] Sorting(){
		while(length > 0){
			int i=0;
			int temp;
			
			while(i < length - 1){
				if(arr[i] > arr[i+1]){
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
				i++;
			}
			length--;
		}
		return arr;
	}
}
