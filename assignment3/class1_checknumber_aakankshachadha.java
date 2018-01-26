package class5;

public class class1_checknumber_aakankshachadha {
	public static void main(String args[]) {
		int arr[]= {1,4,6,7,8,9,10};
		int num= Integer.parseInt(args[0]);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("number present");
				break;
			}
		}
	}

}
