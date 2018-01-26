package class4;
import java.util.*;


public class class1_array_aakankshachadha {
	public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		System.out.print("enter the no.of elements in array");
		int a=ob.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			
			arr[i]=ob.nextInt();
		}
		for(int i:arr) {
			System.out.print(" "+i);
		}
		int largest=arr[0];
		int secondlargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondlargest) {
				secondlargest=arr[i];
			}
		}System.out.println("secondlargest element is "+secondlargest);
		
	}

}
