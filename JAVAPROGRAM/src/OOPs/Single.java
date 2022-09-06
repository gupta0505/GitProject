package OOPs;

public class Single {
	
	void show()
	{
		System.out.println("it is a single inheritans");
	}
}

class Person extends Single{
	
	void Display()
	{
		System.out.println("java can support single inheritance");
	}
	public static void main(String[] args) {
		
		Person p=new Person();
				p.show();
				p.Display();
		

	}

}
