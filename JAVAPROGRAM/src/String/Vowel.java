package String;

public class Vowel {

	public static void main(String[] args) {
		
		int vcount=0,ccount=0;
		String s="This is a java Program";
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vcount++;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)>='z')
			{
				ccount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
	}

}
