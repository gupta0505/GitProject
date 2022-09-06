package OOPs;

public class Const {
	
	
	int id;
	String name;
	Const(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		
		Const C=new Const(100,"Nisha");
		System.out.println(C.id+" "+C.name);
		
	}

}
