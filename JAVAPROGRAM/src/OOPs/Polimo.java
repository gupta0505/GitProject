package OOPs;

public class Polimo {
	
	void sub()
	{
		System.out.println("Java");
	}
}

class Polim extends Polimo{
	
	void sub()
	{
		System.out.println("Python");
	}
}

class poli extends Polimo{
	
	void sub()
	{
		System.out.println("MySQL");
	}

	public static void main(String[] args) {
		
		Polimo p;
		
		p=new Polim();
		p.sub();
		
		p=new Polimo();
		p.sub();

	}

}
