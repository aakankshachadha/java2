package class5;

public class class1_reverse_aakankshachadha {
public static void reverse(int n)
	{
		int number=n;
		int rev=0;
		while(number>0) {
			int temp=number%10;
			rev=rev*10+temp;
			number=number/10;
		}
		System.out.println(rev);
	}

public static void main(String args[]) {
	int a=Integer.parseInt(args[0]);
	reverse(a);
}


}
