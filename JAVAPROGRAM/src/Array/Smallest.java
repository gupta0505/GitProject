package Array;

public class Smallest {
	
	public static int getSmallest(int []arr,int n)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[0];
	}

	public static void main(String[] args) {
		int[] arr= {9,8,6,7,5,3,4,2,10};
		int length=arr.length;
		System.out.println(getSmallest(arr,length));
	}

}
