package Array;

public class Left {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,7,8};
		int n=3;
		for(int i=0;i<n;i++)
		{
			int j,last;
			last=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=last;
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
