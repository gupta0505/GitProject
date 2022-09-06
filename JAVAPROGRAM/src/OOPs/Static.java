package OOPs;

public class Static {
	
	int id;
	String name;
	static String college="Raisoni";
	
	/*Static(int i,String n)
	{
		id=i;
		name=n;
		//college=c;
	}
	
	public static void main(String[] args) {
		
		Static s=new Static(100,"julie");
		Static s1=new Static(101,"Nisha");
		System.out.println(s.id+" "+s.name+" "+s.college);
		System.out.println(s1.id+" "+s1.name+" "+s1.college);*/
	
	void list(int i,String n)
	{
		id=i;
		name=n;
	}
	void show()
	{
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[]args) {
		Static s=new Static();
		s.list(100, "julie");
		s.show();
		
	}

}
