
public class Largest {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;i<arr.length;i++)
			{
				if(arr[i]>arr[j])
					//{
					
			}
			if(arr[i]>arr[j])
				//{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
		}

	}

}
