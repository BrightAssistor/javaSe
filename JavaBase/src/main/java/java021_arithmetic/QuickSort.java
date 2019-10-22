package java021_arithmetic;

public class QuickSort {
	private int getMiddle(int[] arr,int low,int high) {
		int temp=arr[low];
		System.out.println("low:"+low+";high:"+high+";temp:"+temp+"***************start***********");
		while (low<high) {
			while (low<high&&arr[high]>=temp) {
				high--;	
				System.out.println("low:"+low+";high:"+high);
			}
			
			arr[low]=arr[high];
			printAll(arr);
			while (low<high&&arr[low]<temp) {
				low++;	
				System.out.println("low:"+low+";high:"+high);
			}
			arr[high]=arr[low];
			printAll(arr);
		}
		arr[low]=temp;
		printAll(arr);
		System.out.println("low:"+low+";high:"+high+"***************end***********");
		return low;
		
	}
	private void quick_do(int[] arr,int low,int high){
		if (low<high) {
			int middle = getMiddle(arr, low, high);
			printAll(arr);
			System.out.println("***high="+high+",low="+low+",middle="+middle);
			quick_do(arr, low, middle-1);
			quick_do(arr, middle+1, high);
		}
	}
	public void quick(int[] arr) {
		if (arr.length>1) {
			printAll(arr);
			System.out.println("start");
			quick_do(arr, 0, arr.length-1);
		}
	}
	public void printAll(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i==0) {
				System.out.print("["+arr[i]);
			}else {
				
				System.out.print(","+arr[i]);
			}
			if (i==arr.length-1) {
				System.out.print("]");
				System.out.println();
			}
		}
	}
}
