package Array;

public class Largest {
	
	public static int getLargest(int []arr,int n) {
		
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[n-1];
		
	}
	public static void main(String[] args) {
		int []arr= {65,76,87,98,87,67,100};
		int length=arr.length;
		//length=getLargest(arr,length);
		
		System.out.println(getLargest(arr,length));


		
	}

}
