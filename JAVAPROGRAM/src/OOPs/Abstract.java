package OOPs;

abstract class Abstract {
	
	abstract void run();
	public void eat() {
		System.out.println("aaaaaaaa");
	}
	
}
class Teach extends Abstract{

	@Override
	void run() {
		System.out.println("running");
	}
		public static void main(String []args) {
			
		Abstract a=new Teach();
		a.run();
		a.eat();
	}
}
	
		
	
