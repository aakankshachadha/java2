package class3;
import java.util.*;
public class one_string_in_other {
	public static void main(String[] args) {
		String a,b;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the string");
		a=ob.nextLine();
		System.out.println("enter the string u want to check");
		b=ob.nextLine();
		StringBuffer str=new StringBuffer();
		if(a.contains(b)) {
		System.out.println(a+" contains "+b);
		}
		else {
			System.out.println(a+" doesnot contain "+b);
		}

}
}
