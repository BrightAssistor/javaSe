package java021_arithmetic;

//递归算法求5的阶乘 5！=？
public class RecursionDemo {
	public static void main(String[] args) {
		System.out.println(Recursion.getFac(5));
	}
}

class Recursion{
	//递归求阶乘
	public static int getFac(int num){
		if (num == 1) {
			return 1;
		}else {
			return num * getFac(num - 1);
		}
	}
}