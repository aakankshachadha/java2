package class7;

public class class1_subarray_aakankshachadha {
	public static int subarray( int arr[],int a){
		int maxlength=1;
		int count=1;
		for(int i=1;i<a;i++){
			
			if(arr[i]>arr[i-1])
				count++;
			else{
				if(maxlength<count)
					maxlength=count;
				count=1;
			}
		}
		if(maxlength<count)
			maxlength=count;
		return maxlength;
	}
	public static void main(String[] args)
	{
		int arr[]={4,6,2,44,77,81,23,45,60};
		int a=arr.length;
		System.out.println("The Length of Longest Asssending Subarray is "+subarray(arr,a));
	}
}


