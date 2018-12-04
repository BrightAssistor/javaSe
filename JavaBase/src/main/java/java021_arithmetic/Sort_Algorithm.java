package java021_arithmetic;

import java.util.Arrays;

/**
 * 排序算法测试
 */
public class Sort_Algorithm {
	public static void main(String[] args) {
		//定义一个数组
		int [] array = {34,30,28,22,19,15,6,2,34,78,10,45};
//***************************************************************
		//一、自带排序sort();
//			Arrays.sort(array);
		//二、冒泡排序实现排序
//		new Bubble().sortByBubble(array);
		//三、选择排序实现排序
//		new Choose().sortByChoose(array);
		//四、插入排序实现排序
//		new insert().sortByInsert(array);
		//五、快速排序实现排序
		
//***************************************************************
		//输出结果
		for (int i : array) {
			System.out.print(i+"\t");
		}
		
		
	}
}
/**
 * 冒泡排序
 * @author zhou
 * @return 两两比较，将最大值或最小值推至一端，剩余的数重复此步骤（1和2比较，2和3比较，3和4比较。。。。）
 */
class Bubble{
	public int[] sortByBubble(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
		
	}
}
/**
 * 选择排序
 * @author zhou
 * @return 两两比较，拿第一个位置上的数和其他一一比较，然后拿第二位上的数与其他一一比较
 * 		         重复执行；（1和2比较，1和3比较，1和4比较。。。。。）
 */
class Choose{
	public int[] sortByChoose(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return null;
		
	}
}
/**
 * 插入排序
 * @author Administrator
 * @return 以第一个为基准，相当于虚拟的一个数组，
 * 遍历之后的数依次比较并放入；（1和2比较，2大则插入到1前，否则不变；然后3和1、2比较根据大小插入）
 */
class insert{
	public int[] sortByInsert(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp=array[i];
			int j=i;
			while (j>0&&temp<array[j-1]) {
				array[j]=array[j-1];
				array[j-1]=temp;
				j--;
			}
			
		}
		
		return array;
		
	}
}
/**
 * 快速排序
 * @author Administrator
 * @return 在冒泡的基础上改进，进行一轮排序后中间一个数的一边整体大于另一边，然后每一边重复同样的步骤；
 * （1、2、3、4、5完成一轮后，3的前面的数都小于后面的数）
 */
class quik{
	public void quik(int[] array) {
		
	}
}
