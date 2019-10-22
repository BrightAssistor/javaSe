package java021_arithmetic;

public class Test {

	public static void main(String[] args) {
		int[] arr={99,2,34,1,88,54,3,98,23,57,103,0,0};
		//冒泡
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1-i; j++) {
//				if (arr[j+1]>arr[j]) {
//					int temp = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1] = temp;
//					
//				}
//			}
//		}

		//选择排序
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[j]>arr[i]) {
//					int temp = arr[j];
//					arr[j]=arr[i];
//					arr[i] = temp;
//					
//				}
//			}
//		}
		//插入排序
//		for (int i = 1; i < arr.length; i++) {
//			int temp = arr[i];
//			int j = i;
//			while (j>0&&arr[j-1]>temp) {
//				arr[j]=arr[j-1];
//				arr[j-1]=temp;
//				j--;
//			}
//		}
		new QuickSort().quick(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
