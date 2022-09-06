package flow_Control;

public class Swap {

	public static void main(String[] args) {
	
		int a=10,b=20,c=30;
		/*int t;
		t=a;
		a=b;
		b=c;
		c=t;*/
		
		a=b;
	    b=c;
	    c=c-a;
		
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}

}
