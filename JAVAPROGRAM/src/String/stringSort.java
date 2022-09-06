package String;

import java.util.Arrays;

public class stringSort {

	public static void main(String[] args) {
		
		String s="Deepak";
		
		char array[]=s.toCharArray();
		
		Arrays.sort(array);
		
		s=new String(array);
		
		System.out.println(s);

	}

}
