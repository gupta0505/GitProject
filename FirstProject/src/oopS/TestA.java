package oopS;
        //INHERTANCE
public class TestA {
	float salary=30000;
	void west()
	{
   System.out.println(40000);
	}
}
class TestB extends TestA{
	int Bouns=10000;
	void east()
	{
		System.out.println(500);
	}
}

class TestC extends TestB{
	String name="Deepak";
	void north()
	{
		System.out.println("kumar");
	}

	public static void main(String[] args) {
		
		TestB t=new TestB();
		TestC t1=new TestC();
		System.out.println(t1.name);
		t.west();
		t.east();
		t1.north();
		
	

	}

}
