package oopS;

         //STATIC VARIABLE          
public class Company {
	static String name="TCS";
	String EmployeeName;
	int id;
	
 static	void change()
	{
		name="Infosys";
	}
	
	Company(String n,int i)
	{
		EmployeeName=n;
		id=i;
	}
	
	void Record()
	{
		System.out.println(name+" "+EmployeeName+" "+id);
	}
	
	public static void main(String[] args) {
		Company c1=new Company("Deepak",121);
		Company c2=new Company("Julie",131);
		c1.Record();
		c2.Record();
	}
	
	
}


	
