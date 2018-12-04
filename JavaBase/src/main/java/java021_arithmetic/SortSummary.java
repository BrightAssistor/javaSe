package java021_arithmetic;

import java.util.Arrays;

public class SortSummary {
	public static void main(String[] args) {
		int[]array={45,87,1,4,98,23,56};
		//排序第一种方法：自带
//		Arrays.sort(array);
//		for (int i : array) {
//			System.out.println(i);
//		}
		
		//排序第二种方法：冒泡
//		for (int i = 0; i < array.length-1; i++) {
//			for (int j = 0; j < array.length-1-i; j++) {
//				if (array[j]>array[j+1]) {
//					int temp=array[j];
//					array[j]=array[j+1];
//					array[j+1]=temp;
//				}
//				System.out.print("第"+i+"次"+"\t"+"j="+j+"\t");
//				for (int t : array) {
//					System.out.print(t+"\t");
//				}
//				System.out.println();
//			}
//		}
		//排序第三种方法：选择
//		for (int i = 0; i < array.length-1; i++) {
//			for (int j = i+1; j < array.length; j++) {
//				if (array[i]>array[j]) {
//					int temp=array[i];
//					array[i]=array[j];
//					array[j]=temp;
//				}
//				System.out.print("第"+i+"次"+"\t");
//				for (int k : array) {
//					System.out.print(k+"\t");
//				}
//				System.out.println();
//			}
//		}
		//排序第四种：插入
//		for (int i = 1; i < array.length; i++) {
//			int target=array[i];
//			int j=i;
//			while (j>0&&target<array[j-1]) {
//				array[j]=array[j-1];
//				array[j-1]=target;
//				j--;
//				
//			}
//		}
//		for (int i : array) {
//			System.out.print(i+"\t");
//		}
		
		//排序第五种：快速排序
	        new QuickSort().quick(array);//别忘记arr.length-1
	        for (int i : array) {
				System.out.print(i+"\t");
			}
	        
	}
 
}
