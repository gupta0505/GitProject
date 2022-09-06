package oopS;


public class Overloading {
	
	 void add(String s)
	{
		System.out.println("aaaaaaaaaaa");
	}
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String []args) {
	Overloading o=new Overloading();
	o.add("aaaaaaaa");
	o.add(11, 11, 11);
	
	 
	}
	
			
		
	
}

