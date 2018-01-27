package class2;
import java.util.*;

public class remove_vowels {
	public static void main(String[] args) {
		        String a, b;
		       Scanner scan = new Scanner(System.in);
		       
		       System.out.print("Enter a String ");
		       a = scan.nextLine();
		       
		       System.out.println("on removing Vowels from The String [" +a+ "]");
		       b = a.replaceAll("[aeiouAEIOU]", "");
		              
		       System.out.println("new string is "+b);
		   }
		}
		
