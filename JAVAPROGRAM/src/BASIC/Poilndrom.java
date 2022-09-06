package BASIC;

public class Poilndrom {

	public static void main(String[] args) {
		
		int num=232, temp;
		int rev=0, rem;
		
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
			System.out.println(" is poli");
		else
			System.out.println(" is not");
		
	}

}
