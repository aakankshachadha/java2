package class5;

public class class1_staticblock_aakankshachadha {
	static int num;
	static {
		System.out.println("in block 1");
	     num=10;
	}
	static {
		System.out.println("in block 2");
		num=20;
	}
	public static void main(String args[]) {
		System.out.print("number is "+num);
	}
}
