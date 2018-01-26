package class10;

public class class1_reverse_aakankshachadha {
	public static void main(String[] args) {
		int d, n=123,r,rev=0;
		System.out.println("number is "+n);
		d=n;
		while(d!=0)
		{ 
			r=d%10;
			d=d/10;
			rev=rev*10+r;
		}
		System.out.print("reverse of number is="+rev);
	}

}
