package Array;

public class findDublicate {

	public static void main(String[] args) {
		
		int[]arr= {11,22,11,22,55,66};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}
