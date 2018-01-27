package class6;

public class total_words {
	public static void main(String args[]) {
	String a=" my name is aakanksha";
	int count=0;
	int count1=1;
	StringBuffer ob=new StringBuffer();

	if(a.charAt(0)==' ') {
		for(int i=0;i<=a.length()-1;i++) {
			if(a.charAt(i)==' ') {
				count++;
			}
		}System.out.print("total no. of words are "+count);
		}
	if(a.charAt(0)!=' ') {
		for(int i=0;i<=a.length()-1;i++) {
			if(a.charAt(i)==' ') {
				count1++;
			}
		}System.out.print("total no. of words are "+count1);
		}
}
}
