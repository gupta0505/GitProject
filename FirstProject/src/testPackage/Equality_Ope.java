package testPackage;

public class Equality_Ope {

	public static void main(String[] args) {
		
		System.out.println(10==20);
		System.out.println('a'==97.0);
		System.out.println('a'=='b');
		System.out.println(false==false);
		System.out.println(true==false);
		
		Thread t1=new Thread();
		Thread t2=new Thread ();
		Thread t3=t1;
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
		Thread t=new Thread();
		Object o=new Object();
		String s=new String("Deepak");
		System.out.println(t==o);
		System.out.println(o==s);
		System.out.println(s==t);
		
		String s1=new String("Deepak");
		String s2=new String("Deepak");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		

	}

}

