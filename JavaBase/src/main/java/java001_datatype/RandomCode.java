package java001_datatype;
import java.util.Random;
public class RandomCode {
	public static void main(String[] args) {
		GetCode code = new GetCode();
		System.out.println(code.getCode());
	}
}

class GetCode {
	public String getCode() {
		char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
				'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
				'V', 'W', 'X', 'Y','Z','0','1','2','3','4','5','6','7','8','9'};
		
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int count = 0;
		while (true) {
			char a = codeSequence[random.nextInt(36)];
			if (sb.indexOf(a+"") == -1) {
				sb.append(a);
				count++;
				if (count == 4) {
					break;
				}
			}
		}
		return sb.toString();
	}
}
