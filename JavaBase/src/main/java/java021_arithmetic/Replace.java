package java021_arithmetic;
/**
 * 输入任意字符串,如果不够十位，用0替换
 * @author DELL
 * 
 *
 */
public class Replace {
	public static void main(String[] args) {
		String aString="c";
		String target = new Alter().getTarget(aString);
		System.out.println(target);
	}
}

class Alter{
	/**
	 * 在类里封装的方法：使用StringBuffer增加0
	 * @param string
	 * @return 返回增加过0的字符串
	 */
	public String getTarget(String string) {
		String temp="0";
		StringBuffer buffer = new StringBuffer(string);
		while (buffer.length()<10) {
			buffer=buffer.append(temp);
		}
		return buffer.toString();
		
	}
}