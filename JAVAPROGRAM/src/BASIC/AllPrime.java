package BASIC;

public class AllPrime {

	public static void main(String[] args) {

		int i=1,j=1,n=0,ct=0;
		while(n<25)
		{
			j=1;
			ct=0;
			while(j<=i)
			{
				if(i%j==0) 
				ct++;
				j++;
				
			}
			if(ct==2)
			{
				System.out.printf("%d ",i);
				n++;
			}
			i++;
		}

	}

}
