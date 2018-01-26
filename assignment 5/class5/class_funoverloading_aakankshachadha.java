package class5;

public class class_funoverloading_aakankshachadha {
	public static void print() {
		System.out.println("hello");
	}
	public static void print(int n) {
		System.out.println("hello "+n);
	}
	public static void print(double n) {
		System.out.println("hello "+n);
	}
	public static void main(String args[]) {
		print();
		print(1.2);
		print(102);
	}
}
