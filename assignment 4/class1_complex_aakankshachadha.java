package class2;

public class class1_complex_aakankshachadha {
	public static void main(String args[]) {
		complex c1 =new complex(10,20);
		complex c2=new complex(2,3);
		complex result=new complex();
		System.out.println("addition ");
		result=c1.add(c2);
		result.display();
		System.out.println("multiplication  ");
		result=c1.mult(c2);
		result.display();
		}
}
