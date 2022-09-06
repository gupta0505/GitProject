package OOPs;

public class Inheritance {
	
	String name="julie";
}
	
	class Test extends Inheritance{
		
	int age=25;

	public static void main(String[] args) {
		
		Test t=new Test();
		System.out.println(t.name);
		System.out.println(t.age);
	

	}

}
