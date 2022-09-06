package OOPs;

abstract class Student {
	
	abstract void sound();
	
	public void eat()
	{
		System.out.println("aaaaaaaaaa");
	}
	
}

class College extends Student{
	
	

	@Override
	void sound() {
		System.out.println("bbbbbbbbbbbb");
		
	}
}
	
class Main{
	
	public static void main(String[]args) {
		
	Student c=new College();
		c.sound();
		c.eat();
	}
}
		
		

	
		
		
		
		
		
		
	





	

