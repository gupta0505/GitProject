package Practice;

public class Array {

	public static void main(String[] args) {
		int []arr= {9,7,5,3,1,2,4,6,8};
		int n=3;
		for(int i=0;i<n;i++)
		{
			int j,first;
			first=arr[arr.length-1];
			for( j=arr.length-1;j>0;j--)
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


