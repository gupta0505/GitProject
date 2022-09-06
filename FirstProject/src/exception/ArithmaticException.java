package exception;

public class ArithmaticException extends Exception {

	public static void main(String[] args) {
		{
			System.out.println("aaaaaaaaaaaa");
			try {
				System.out.println(10/0);
			}
			catch(Exception e)
			{
				System.out.println(10/0);
			}
			System.out.println("bbbbbbbbbbbb");
		}
	}

}
