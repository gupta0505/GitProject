package oopS;

          //CONSTRUCTOR OVERLOADING

public class MakeUp {
	
	String name;
	int cost;
	
	MakeUp(String n, int i)
	{
		name=n;
		cost=i;
	}
	
	MakeUp(int i,String n)
	{
	name=n;
	cost=i;
		
	}
	void display(){
		System.out.println("name"+" "+cost);
	}

	public static void main(String[] args) {
		MakeUp m1=new MakeUp("Lipstick",500);
		MakeUp m2=new MakeUp(200,"kajal");
		m1.display();
		m2.display();
		
		
		
	}

}
