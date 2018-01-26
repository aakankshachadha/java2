package class10;

public class class1_palindrome_aakankshachadha {
	 public static void main(String[] args) {
			int d, n=12321,r,rev=0;
			System.out.println("number is "+n);
			d=n;
			while(d!=0)
			{ 	
				r=d%10;
				d=d/10;
				rev=rev*10+r;
			}
			System.out.println("reverse of number is="+rev);
		
	 if(rev==n)
		 System.out.print(n+" is palindrome no.");
	 else
		 System.out.print(n+" is not palindrome no.");

	 }
}
