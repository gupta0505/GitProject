package OOPs;

public class Hierarchical {
	
	void eat()
	{
		System.out.println("i'm eating");
	}
}
class Nisha extends Hierarchical{
	
	void cook()
	{
		System.out.println("bhabhi makeing dinner");
		
	}
}
class Jay extends Hierarchical{
	
	void seen()
	{
		System.out.println("bhai swa a mob");
	}
	public static void main(String[] args) {
		Jay j=new Jay();
		Nisha n=new Nisha();
		j.eat();
		j.seen();
		n.cook();
		
		
	}

}
