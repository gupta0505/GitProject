package testPackage;

public class Arithmaric_Ope {

	public static void main(String[] args) {
		
		char x;
		char y;
		
		System.out.println('a'+45.5);
		
		System.out.println(10/0.0);//show infinity
		
		System.out.println(-10/0.0);
		
		//System.out.println(10/0); //RE
		
		//System.out.println(0/0); //RE
		
		System.out.println(0.0/0); //NaN
		
		System.out.println(-0.0/0.0);
		
		System.out.println(10<Float.NaN);
		System.out.println(10<=Float.NaN);
		System.out.println(10>=Float.NaN);
		System.out.println(10==Float.NaN);
		System.out.println(Float.NaN==Float.NaN);
		System.out.println(10!=Float.NaN);
	    System.out.println(Float.NaN!=Float.NaN);
		
		
	}

}
