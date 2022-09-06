package String;

public class StringToChar {
	
	public static void main(String[] args) {
		
	int num=233265,number, rev=0,rem;
	//number=num;
	while(num !=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);

	
	
	
	

		
	}

}
