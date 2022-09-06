package testPackage;

public class Concatenation_Relational {

	public static void main(String[] args) {
		
		//Concatenation Operator[+]
		
		String a="Deepak";
		int b=20, c=30, d=40;
		System.out.println(a+b+c+d);
		System.out.println(b+c+d+a);
		System.out.println(b+c+a+d);
		System.out.println(b+a+c+d);
		
		//a=b+c+d;
		a=a+b+c;
		//b=a+c+d;
		b=b+c+d;
		
		//Relational Operator[<,<=,>,>=]
		
		System.out.println(20<40);
		System.out.println(20>40);
		System.out.println(30<=30);
		System.out.println(20>=30);
		System.out.println('a'>'A');
		System.out.println('a'<97.8);
		
		System.out.println(true>false);
		
		System.out.println(10<20<30);
		
		
		
		
	}

}
