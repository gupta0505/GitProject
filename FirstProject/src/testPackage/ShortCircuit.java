package testPackage;

public class ShortCircuit
{

	public static void main(String[] args) {
		

		int x=10, y=15;
		if(++x<10 & ++y>15) 
		{
			x++;
			}
		else {
			y++;
		}
		System.out.println(x+"  "+y);
		
		int x1=10, y1=15;
		if(++x1<10 && ++y1>15) 
		{
			x1++;
			}
		else {
			y1++;
		}
		System.out.println(x1+"  "+y1);
		
		int a=10, b=15;
		if(++a<10 | ++b>15) 
		{
			a++;
			}
		else {
			b++;
		}
		System.out.println(a+"  "+b);
		
		int a1=10, b1=15;
		if(++a1<10 || ++b1>15) 
		{
			a1++;
			}
		else {
			b1++;
		}
		System.out.println(a1+"  "+b1);
		
		int m=10;
		if(++m<10 && (m/0>10))
		{
			System.out.println("Hello");
			}
		else {
			System.out.println("Hi");
		}
	}

}
