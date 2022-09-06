package thread;

public class MyThread1 {
}
class  Test
{
	public static void main(String[] args) {
		{
			System.out.println(Thread.currentThread().getName());
		MyThread1 t=new MyThread1();
		System.out.println(t.getName());
		Thread.currentThread().setName("Deepak");
		System.out.println(Thread.currentThread().getName());
		
		}
				

	}

}
