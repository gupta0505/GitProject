package oopS;

public class Person {
	
	String name;
	int id;
	
	Person(String name, int id)
		{
		this.name=name;
		this.id=id;
		}
}
  
class Student4 extends Person{
		int marks;
		int age;
	Student4(String name, int id, int marks, int age)
	{
	 super(name,id);
	 this.marks=marks;
	 this.age=age;
	 }


	public static void main(String[] args) {
		Student4 s=new Student4("Deepak",121,88,29);
		s.name="Deepak";
		s.id=121;
		s.marks=88;
		s.age=29;
		
	}
}



