package OOPs;

public class OverLoading {
	
	void display()
	{
		System.out.println("no argu");
	}
	void display(int a)
	{
		System.out.println(a);
	}
	void display(int a,String n)
	{
		System.out.println(a+" "+n);
	}

	public static void main(String[] args) {
		
		OverLoading o=new OverLoading();
		o.display();
		o.display(10);
		o.display(11,"julie");
	}

}
