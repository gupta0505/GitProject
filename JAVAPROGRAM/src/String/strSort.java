package String;

import java.util.Arrays;

public class strSort {

	public static void main(String[] args) {
		
		String str="deepak kumar";
		
		char[] arr=str.toCharArray();
		
		Arrays.sort(arr);
		
		str=new String(arr);
		
		System.out.println(str);
				
		
	}

}
