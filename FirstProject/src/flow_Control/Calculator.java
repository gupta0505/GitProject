package flow_Control;

import java.util.Scanner;

public class Calculator {
	public static void main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("first no");
		int no1=s.nextInt();
		System.out.println("second no");
		int no2=s.nextInt();
		System.out.println("no");
		int no=s.nextInt();
		int res;
		switch(no)
		{
		case 1:
			res=no1+no2;
			System.out.println(res);
			break;
		case 2:
			res=no1-no2;
			System.out.println(res);
			break;
		case 3:
			res=no1*no2;
			System.out.println(res);
			break;
		default:
			System.out.println("invalid no");
			break;
		}
		
		
				
		}
		
		
		
	}


