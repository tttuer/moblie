package Searching;

public class BinarySearching {
	private int low;
	private int high;
	
	public BinarySearching(){
		this.low = 0;;
		this.high = 0;;
	}
	
	public BinarySearching(int length){
		this.low = 0;
		this.high = length - 1;
	}
	
	public int Serach(int key,int[] arr){
		return Searching(this.low,this.high,key,arr);
	}
	
	public int Searching(int low,int high,int key,int[] arr){
		if(arr[low] == key)
			return low;
		
		if(arr[high/2] > key){
			return Searching(low,high/2,key,arr);
		}
		else{
			return Searching((low+high)/2,high,key,arr);
		}
		
	}
}
