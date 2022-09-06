package BASIC;

public class Armstrong {

	public static void main(String[] args) {
		
		int num=52, number;
		int total=0,temp;
		
		number=num;
		while(number !=0)
		{
			temp=number%10;
			total=total+temp*temp;
			number=number/10;
		}
		if(total==num)
			System.out.println(num+": is arm");
		else
			System.out.println(num+": is not");
	}

}
