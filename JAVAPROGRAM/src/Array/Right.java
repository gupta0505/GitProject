package Array;

public class Right {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,7};
		int n=3;
		for(int i=0;i<n;i++) {
			int j,first;
			first=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=first;
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
