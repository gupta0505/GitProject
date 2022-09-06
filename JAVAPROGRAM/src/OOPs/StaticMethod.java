package OOPs;

public class StaticMethod {
	
	int id=12;
	
	static String name="julie";
	static void list()
	{
		name="nisha";
	}
	void show()
	{
		System.out.println(id+" "+name);
	}
	//StaticMethod(int i)
	//{
		//id=i;
	//}

	public static void main(String[] args) {
		StaticMethod s=new StaticMethod();
		s.list();
		s.show();
				
		
	}

}
