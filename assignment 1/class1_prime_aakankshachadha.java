package class8;

public class class1_prime_aakankshachadha {
	public static void main(String[] args) {
		int a=10,i=2,count=0;
		System.out.println("value of no. to be checked is "+a);
		while(i<a/2)
		{
			if(a%i==0) 
				count++;
		    i++;
		}
	      
		if(count==0) {
		System.out.print(a+" is prime");
		}
		else 
		System.out.print(a+" is not prime");
		
	}

}
