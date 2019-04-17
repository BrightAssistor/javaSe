package java011_exception;
/**
 * 测试有return时trycatch执行顺序
 * 无论静态方法还是普通方法，无论正常try还是异常catch的return，最终结果都是舍弃finally中的修改；
 * @author 14861
 *
 */
public class FinallyReturnOrder2 {
	public static void main(String[] args) {
		int go = go();
		System.out.println(go);
	}
public static int go() {
	try{
		   //待捕获代码    
		}catch(Exception e){
		    System.out.println("catch is begin");
		    return 1;
		}finally{
		     System.out.println("finally is begin");
		     return 2 ;
		}
}
	
	
}
