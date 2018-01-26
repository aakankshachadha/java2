package class5;

public class Class1_armstrong_aakankshachadha {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		int i=0;
		int a;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			i=i+a*a*a;
			
		}
			System.out.println(i);
		
	}

}
