package OOPs;

public class MultiLevel {
	
	void Dog()
	{
		System.out.println("Dog is animal");
	}
}
class Level extends MultiLevel{
	void Saprow()
	{
		System.out.println("Saprow is a bird");
	}
}
class Multi extends Level{
	
	void appel()
	{
		System.out.println("apple is a friut");
	}

	public static void main(String[] args) {
		
		Multi m=new Multi();
		m.appel();
		m.Saprow();
		m.Dog();

	}

}
