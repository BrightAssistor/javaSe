package java021_arithmetic;

public class QuickTest {
	public int getMiddle(int[] arr,int low,int high) {
		int temp=arr[low];
		while (low<high) {
			while (low<high&&arr[high]>temp) {
				high--;
			}
			arr[low]=arr[high];
			while (low<high&&arr[low]<temp) {
				low++;
			}
			arr[high]=arr[low];
		}
		arr[low]=temp;
		return low;
	}
	public void quick_do(int[] arr,int low,int high) {
		if (low<high) {
			int middle = getMiddle(arr, low, high);
			quick_do(arr, low, middle-1);
			quick_do(arr, middle+1, high);
		}
	}
	public void quick(int[] arr) {
		if (arr.length>0) {
			quick_do(arr, 0, arr.length-1);
		}
	}
}
