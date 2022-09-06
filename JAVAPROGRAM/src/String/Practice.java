package String;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

		String s="deepak";
		
		char[] arr=s.toCharArray();
		
		Arrays.sort(arr);
		
		s=new String(arr);
		
		System.out.println(s);
		
		
	}

}
