package class5;

public class class1_primeconsole_aakankshachadha {
	public static void prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) 
		{
			for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
			count++;
			break;
			}
		}
		if(count==0) {
			System.out.println(i);
	}
	}
}
public static void main(String args[]) {
	int a=Integer.parseInt(args[0]);
	prime(a);
}
	
}
