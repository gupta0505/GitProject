package OOPs;

public class Overriding {
	
	void run() {
		System.out.println("vihical");
	}
}
	class Riding extends Overriding{
		
		void run()
		{
			System.out.println("safe");
		}
	
		public static void main(String []args) {
			
			Riding r=new Riding();
			r.run();
		}
		
	}


