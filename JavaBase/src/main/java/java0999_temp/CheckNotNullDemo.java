package java0999_temp;
import static com.google.common.base.Preconditions.checkNotNull;
public class CheckNotNullDemo {

	public static void main(String[] args) {
		say(null);
	}

	public static void say(String a) {
		checkNotNull(a,"data of a为空");
		System.out.println(a);
	}
}
