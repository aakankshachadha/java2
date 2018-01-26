package class44;

public class waveform {
	void swap(int arr[],int a,int b) {
	    int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	void sort(int arr[],int m) {
		for(int i=0;i<m;i+=2) {
			if(i>0 && arr[i-1]>arr[i])
				 swap(arr,i-1,i);
			if(i<m-1 && arr[i]<arr[i+1])
				swap(arr,i,i+1);
		}
	}
	public static void main(String[] args) {
		waveform ob=new waveform();
		int arr[]= {33,6,8,44,99,12,32,66,10};
		int y=arr.length;
		ob.sort(arr,y);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
