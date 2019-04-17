package java0999_temp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lambdaDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> asList = Arrays.asList("bz","z","ghj");
		List<Integer> asList2 = Arrays.asList(6,12,8);
		Collections.sort(asList, (a,b) -> a.compareTo(b));
		Collections.sort(asList2, (a,b) -> a.compareTo(b));
		System.out.println(asList);
		System.out.println(asList2);
		int[] b = {};
		int[] c = new int[6];
		int[] d = new int[]{};
	}

}
