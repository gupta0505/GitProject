package oopS;

public class Friends {
	
	String name;
	int age;
	int dob;
	
	void list(String n,int a,int d)
	{
		this.name=n;
		age=a;
		dob=d;
	}
	void display()
	{
		System.out.println(name+" "+age+" "+dob);
	}
}
class BestFriend{
	
	public static void main(String[] args) {
		Friends f1=new Friends();
		f1.list("deeksha", 23, 31);
		f1.display();
		
		
		
	}
}
	


