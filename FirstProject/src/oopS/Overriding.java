package oopS;

public class Overriding {

	int getOfInterest()
	{
		return(0);
	}
}
class SBI extends Overriding{
	int getOfIntrest()
	{
		return(8);
	}
}
class ICICI extends SBI{
	int getOfIntrest()
	{
		return(6);
	}
}
	class Test{
	public static void main(String []args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		System.out.println(s.getOfIntrest());
		System.out.println(i.getOfInterest());
		System.out.println(i.getOfIntrest());
		
	}
		
}



