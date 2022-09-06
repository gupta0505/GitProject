package oopS;

public class Parent {
	void mr() {
	int aaaa=1234;
	int bbbb=12467;
	String name="Deepak";
	}
//class Subclass extends Parent {
	
//}

class Child extends Parent{
	void mrs() {
	int cccc=87665;
	long ddd=57664;
	String name="Julie";
	}
	
		public static void main(String[] args) {
		
		Child c=new Child();
		c.mr();
		c.mrs();
		
		
		
		
	}

}
}
