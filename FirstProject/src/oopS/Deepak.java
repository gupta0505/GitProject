package oopS;

public class Deepak {
	
	String Cname="Raisoni";
	String Sname;
	int id;
	Deepak(String s,int i, String c)
	{
		s=Sname;
		i=id;
		c=Cname;
	}
	void details()
	{
		System.out.println("Sname"+" "+" "+id+" "+"Cname");
	}
class kumar2{
	public static void main(String[] args) {
		
		Deepak d=new Deepak("Deepak",12,"Raisoni");
		Deepak d1=new Deepak("Julie",13,"Raisoni");
		
		
		d.details();
		d1.details();
		
	}

}
}
