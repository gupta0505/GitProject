package flow_Control;

public class Statement_Switch {

	public static void main(String[] args) {
		
		/*int x=10;
		switch(x)
		{
		System.out.println("Hello")
		}*/
		
		/*int x=10;
		int y=20;
		switch(y)
		{
			case 10:
				System.out.println("hii");
				break;
			case y: //case lable are constant
				System.out.println("Hiii");
				break;
		} */
		
		int x=10;
		switch(x=1)
		{
		case 10:
			System.out.println(10);
			break;
		case 10+20+30:
			System.out.println(60);
			break;
		}
		
		byte b=100;
		switch(b+1)
		{
		case 10:
			System.out.println(10);
			break;
		case 20:
			System.out.println(20);
			break;
		case 100:
			System.out.println(100);
			break;
		case 1000:
			System.out.println(1000);
			break;
		}
		
		switch(x)
		{
		case 1:
		case 2:
		case 3:
			System.out.println("q-4");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("q-1");
			break;
		}
		
		int x1=100;
		switch(x1)
		{
		case 0:
			System.out.println(0);
			break;
		case 10:
			System.out.println(10);
			break;
		case 100:
			System.out.println(100);
		default:
			System.out.println("def");
			
		}
		
	}

}
