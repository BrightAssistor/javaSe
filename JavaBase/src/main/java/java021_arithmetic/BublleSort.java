package java021_arithmetic;

//冒泡排序
public class BublleSort {
	public static void main(String[] args) {
		int[] arr = { 3, 8, 6, 1, 9 };

		// 比较arr.length - 1轮
		for (int i = 0; i < arr.length - 1; i++) {
			// 比较arr.length -1 - i次(每一轮比较出来的最大数不用比较了)
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// 循环输出
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length-1; j >0+i; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		// 循环输出
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
