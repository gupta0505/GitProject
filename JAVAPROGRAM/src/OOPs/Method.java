package OOPs;

public class Method {
	
	int id;
	String name;
	
	void Record(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		 
		Method m=new Method();
		Method m1=new Method();
		
		m.Record(100,"Nisha");
		m.display();
		
		m1.Record(101, "Julie");
		m1.display();
		
	}

}
