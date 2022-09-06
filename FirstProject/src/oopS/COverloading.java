package oopS;

public class COverloading {

	int id=12;
	String name="name";
	COverloading(int i,String s)
	{
		i=id;
		name=s;
	}
	COverloading(String s)
	{
		s=name;
	}
	COverloading(String s,int i)
	{
		s=name;
		i=id;
	}
	
	public static void main(String []args)
	{
		COverloading d=new COverloading (12,"Deepak");
		COverloading d1=new COverloading (21,"Julie");
		
		System.out.println(d.id+" "+d.name);
		System.out.println(d1.id+" "+d1.name);
		System.out.println(d.name);
		System.out.println(d1.name+" "+d1.id);
}	
}
