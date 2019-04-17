package java001_datatype;


public class Test {
	public static void main(String[] args) {
//		String enc = System.getProperty("file.encoding");
//	    System.out.println(enc);
//	    byte a=127;
//	    Short b=1;
//	    Integer c=129;
//	    System.out.println(Integer.toBinaryString(10000));
//	    System.out.println(Integer.toBinaryString(-100));
//	    System.out.println(Integer.toBinaryString(-129));
//	    System.out.println(Integer.toBinaryString(-1));
//	    System.out.println(Long.toBinaryString(-1));
//	    System.out.println(Short.reverseBytes(b));
//	    System.out.println(Long.toBinaryString(-8));
//	    System.out.println(Long.toBinaryString(8));
//	    System.out.println('\u0002');
	    
	    
//	    int a=2;   
//	    System.out.println(--a/2);  
//	    System.out.println(--a/2+(++a*2));  
//	    System.out.println(++a*2+--a/2);
	    int i = 5;
	      switch(i){
	         case 0:
	            System.out.println("0");
	         case 1:
	            System.out.println("1");
	         case 2:
	            System.out.println("2");
	         default:
	            System.out.println("default");
	      }
	      
	      
//	      Integer e = 1;
//	      switch(e){
//	         case 1:
//	            System.out.println("0");
//	         case 0:
//	            System.out.println("1");
//	         case 2:
//	            System.out.println("2");
//	         default:
//	            System.out.println("default");
//	      }
	      
	      
//	      Integer i1 = 200;
//	        Integer i2 = new Integer(200);
//	        int j = 200;
//	        System.out.println(i1 == j);//输出：true
//	        System.out.println(i2 == j);//输出：true
//	        
//	        Character ch = Character.valueOf('a'); 
//	        if ('a' <= 127) { // must cache
//	            System.out.println("dd");
//	        }
//	        char  aa='的';
//	        char  bb='的';
//	        Character cc=Character.valueOf('的');
//	        Character dd=Character.valueOf('的');
//	        System.out.println(aa==bb);
//	        System.out.println(cc==dd);
//	        System.out.println(aa>=dd);
//	        System.out.println(aa>dd);
	        
//	        String s1="a"+"b"+"c";
//	        String s2="abc";
//	        System.out.println(s1==s2);
//	        System.out.println(s1.equals(s2));
	      StringBuilder dd;
	      
	      String s1="ab";
	      String s2="abc";
	      String s3=s1+"c";
	      System.out.println(s3==s2);         // false
	      System.out.println(s3.equals(s2));  // true
	}
}
