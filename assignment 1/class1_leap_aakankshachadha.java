package class4;

public class class1_leap_aakankshachadha {
      public static void main(String[] args) {
    	  int year=2015;
    	  if((year%400==0)||((year%4==0)&&(year%100!=0))) {
    		  System.out.print(year+"  is leap year");
    	  }
    	  else
    		  System.out.print(year+"  is not leap year");
      }
}
