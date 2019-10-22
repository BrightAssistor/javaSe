package java021_arithmetic;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseNumSort {

	public static void main(String[] args) {
        int d = 10;//d为最大数的位数1,10,100。。。
        int [] array ={98,89,23,14,32,6,9,43,89};
        radixSort(d,array);
//      for(int e:array){
//          System.out.println(e);
//      }
        //为了输出好看，用了一个ArrayList数组
        ArrayList<Integer> list = new ArrayList<>();
        for(int e:array){
            list.add(e);
        }
        System.out.println(list);


	}
	private static void radixSort(int d,int[] array){
        int n=1;//代表位数对应的数：1,10,100...
        int k=0;//保存每一位排序后的结果用于下一位的排序输入
        int[][] bucket=new int[10][array.length];//排序桶用于保存每次排序后的结果，这一位上排序结果相同的数字放在同一个桶里
        int[] num=new int[array.length];//用于保存每个桶里有多少个数字 ,最多为输入数组长度
        while(n<=d)
        {
            for(int e:array) //将数组array里的每个数字放在相应的桶里
            {
                int digit=(e/n)%10;
                bucket[digit][num[digit]]=e;
                num[digit]++;
            }
            for(int i=0;i<array.length;i++)//将前一个循环生成的桶里的数据覆盖到原数组中用于保存这一位的排序结果
            {
                if(num[i]!=0)//这个桶里有数据，从上到下遍历这个桶并将数据保存到原数组中
                {
                    for(int j=0;j<num[i];j++)
                    {
                        array[k]=bucket[i][j];
                        k++;
                    }
                }
                num[i]=0;//将桶里计数器置0，用于下一次位排序
            }
            n*=10;
            k=0;//将k置0，用于下一轮保存位排序结果
        }

    }




}
