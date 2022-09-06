package oopS;

                  // BY CONSTRUCTOR
class Cloths {
	String name;
	int cost;
	String brand;
	Cloths(String n, int c)
	{
		name=n;
		cost=c;
	}
	Cloths(String n,int c,String b)
	{
		name=n;
		cost=c;
		brand=b;
		
	}
	public static void main(String []args) {
		Cloths c1=new Cloths("Top",200);
		Cloths c2=new Cloths("Jeans",1000);
		System.out.println(c1.name+" "+c1.cost);
		System.out.print(c2.name+" "+c2.cost+" "+"Levis");
		
	}
	
}
	


	

