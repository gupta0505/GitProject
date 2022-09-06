
public class Basic {

	public static void main(String[] args) {
		
		int i=1,j=1,n=0,ct=0;
		while(n<25) {
			ct=0;
			j=1;
			while(i<j)
			{
				if(i%j==0)
				{
					j++;
					ct++;
				}
				if(ct==2)
				{
					System.out.println("%d"+i);
					n++;
				}
				i++;
			}
		}
		
	}

}
