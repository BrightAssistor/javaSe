package java011_exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DeleteException {
	public static void main(String[] args) {  
	       DeleteException deleteException = new DeleteException();
//	       deleteException.exception1();
	       deleteException.exception2();
	  }  
	
	
	
	
	
	
	/**
	 * size为固定值，发生数组越界（事实上是for初始化一次，size不再变）
	 */
	public void exception1() {
		List<Integer> intList = new ArrayList<Integer>();  
	       Collections.addAll(intList, 1, 2, 3, 5, 6);  
	       // for循环优化写法，只获取一次长度  
	       for(int i = 0, size = intList.size(); i < size; i++) {  
	           Integer value = intList.get(i);  
	           // 符合条件，删除元素  
	           if(value == 3 || value == 5) {  
	              intList.remove(i);  
	           }  
	       }  
	       System.out.println(intList);  
	}
	
	
	/**
	 * size为变化的值，正常返回，但是漏掉数据（size每次根据真实数据变化）
	 */
	public void exception2() {
		List<Integer> intList = new ArrayList<Integer>();  
	       Collections.addAll(intList, 1, 2, 3, 5, 6);  
	       for(int i = 0; i < intList.size(); i++) {  
	           Integer value = intList.get(i);  
	           // 符合条件，删除元素  
	           if(value == 3 || value == 5) {  
	              intList.remove(i);  
	           }  
	       }  
	       System.out.println(intList);    
	}
	/**
	 * foreach抛出快速失败的当前修改失败
	 */
	public void exception3() {
		       List<Integer> intList = new ArrayList<Integer>();  
		       Collections.addAll(intList, 1, 2, 3, 5, 6);  
		       for(Integer value : intList) {  
		           // 符合条件，删除元素  
		           if(value == 3 || value == 5) {  
		              intList.remove(value);  
		           }  
		       }  
		       System.out.println(intList);  
		    }  
	/**
	 * 采用iterator遍历可以直接删除
	 */
	public void success1() {
		 List<Integer> intList = new ArrayList<Integer>();  
	       Collections.addAll(intList, 1, 2, 3, 5, 6);  
	       Iterator<Integer> it = intList.iterator();  
	       while(it.hasNext()) {  
	           Integer value = it.next();  
	           if(value == 3 || value == 5) {  
	              it.remove();  
	           }  
	       }  
	       System.out.println(intList); 
	}  
	/**
	 *  不使用迭代器的解决方案就是，自己维护索引，删除一个元素后，索引-1，如：
	 */
	public void success2() {
		 List<Integer> intList = new ArrayList<Integer>();  
	       Collections.addAll(intList, 1, 2, 3, 5, 6);  
	       for(int i = 0; i < intList.size(); i++) {  
	           Integer value = intList.get(i);  
	           if(value == 3 || value == 5) {  
	              intList.remove(i);  
	              i--;  
	           }  
	       }  
	        System.out.println(intList);  
	}  
	/**
	 * 从最后一个元素开始遍历，符合条件的删除
	 */
	public void success3() {
		 List<Integer> intList = new ArrayList<Integer>();  
	       Collections.addAll(intList, 1, 2, 3, 5, 6);  
	       for(int i = intList.size() - 1; i >= 0; i--) {  
	           Integer value = intList.get(i);  
	           if(value == 3 || value == 5) {  
	              intList.remove(i);  
	           }  
	       }  
	        System.out.println(intList);  
	}  
}
