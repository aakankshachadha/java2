package class5;

public class class1_ascendingarray_aakankshachadha {
	public static void main(String args[]) {
		int temp=0;
		int arr[]= {1,1,1,1,0,0,1,0};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}System.out.print("ascending order is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}

}
