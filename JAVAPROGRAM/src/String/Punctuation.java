package String;

public class Punctuation {

	public static void main(String[] args) {
		
		String s="Hello Deepak ,'c i call you'. or not!";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='"'||s.charAt(i)==','||s.charAt(i)=='.'||s.charAt(i)=='!'||s.charAt(i)==';'||s.charAt(i)=='/'||s.charAt(i)==':'
					||s.charAt(i)=='?');
			{
				count++;
			}
		}
			System.out.println(count);

	}

}
