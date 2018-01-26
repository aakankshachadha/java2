package class10;

public class string_to_integer {
	public static void main(String[] args) {
		String a="20";
		String b="40";
	    Integer.valueOf(a);
	    System.out.println("first no. is "+a);
	    Integer.valueOf(b);
	    System.out.println("second no. is "+b);
	    if(Integer.valueOf(a)>Integer.valueOf(b)) {
	    	System.out.println(a+" is greater");}
	    	else {
	    		System.out.println(b+" is greater");
	    	}
	    }
	}

