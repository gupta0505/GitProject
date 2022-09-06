package String;

public class Vowel_Constant {

	public static void main(String[] args) {
		String s="Deep";
		int vcount=0,ccount=0;
		for(int i=0;i<=s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vcount++;
			}
			else if((ch>='a'&&ch<='z'))
			{
				ccount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
	}

}
