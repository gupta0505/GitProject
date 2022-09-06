package thread;

public class MyThread2 extends Thread {
	public void run()
	{
		System.out.println("Run method excecuted by Thread:"+Thread.currentThread().getName());
	}
}
class Test2
{
	public static void main(String[] args) {
		{
			MyThread2 t=new MyThread2();
			t.start();
			System.out.println("Main Method executed by Thread:"+Thread.currentThread().getName());
			
		}
	}

}
