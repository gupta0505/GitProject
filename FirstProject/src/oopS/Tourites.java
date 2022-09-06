package oopS;

                        //BY METHODS()
public class Tourites {
	
	String TouritesName;  // create instance variable
	String TouritesPlace;
	int Cost;
	
	void FullDetail(String n, String p,int c) {   //create method
		TouritesName=n;
		TouritesPlace=p;
		Cost=c;
	}
	
	void display() {
		System.out.println(TouritesName);
		System.out.println(TouritesPlace);
		System.out.println(Cost);
	}
	
}
 class Tour
 {
	 
	public static void main(String[] args) {
		Tourites t=new Tourites();
		
		t.FullDetail("Deepak Kumar","Bihar",5000);
		
		t.display();
		
		
	}

}
