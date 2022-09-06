package thread;

public class MyThread extends Thread {
	
	public void start()
	{
		supper.start();
		System.out.println("Start Method");
	}
	public void run()
	{
		System.out.println("Run method");
	}
}
class ThreadDemo
{
	public static void main(String []args) 
	{
		MyThread t= new MyThread();
		t.start();
		System.out.println("Main Method");
		
		
	}
}
	


