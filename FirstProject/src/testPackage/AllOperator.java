package testPackage;

public class AllOperator {

	public static void main(String[] args) {
		//BITWISE OPERATOR
		System.out.println(true&false);
		System.out.println(true|false);
		System.out.println(true^false);
		
		System.out.println(4&5);
		System.out.println(4|5);
		System.out.println(4^5);
		
		//System.out.println(~true);//not apply boolean type
		System.out.println(~4);
		
		System.out.println(!true);
		//System.out.println(!4);//only apply boolean type
		
		//TYPE CAST OPERATOR
		//[implicit]
		int x='a';
		System.out.println(x); //convert char to int automatically by implicit
		
		double d=10;
		System.out.println(d);//convert int to double
		
		//[explicit]
		int y=130;
		//byte b=y;//not convert
		byte b1=(byte)y;
		System.out.println(b1);
		
		int z=150;
		short s=(short)z;
		System.out.println(s);
		
		byte b2=(byte)z;
		System.out.println(b2);
		
		double d1=130.456;
		int x1=(int)d1;
		System.out.println(x1);
		
		//CONDITIONAL OPERATOR
		int i=(10<20)?30:40;
		System.out.println(i);
		
		int i1=(10>20)?30:((40>50)?60:70);
		System.out.println(i1);
		
		
		
		
		
		
		
		
	}
}
