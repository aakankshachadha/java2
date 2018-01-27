package class5;

public class substring {
	public static void main(String args[]) {
	String str="xyz",sub;
	int m;
	m=str.length();
	StringBuffer a=new StringBuffer();
	for(int i=0;i<m;i++) {
		for(int j=i+1;j<=m;j++) {
		sub=(str.substring(i,j));
			System.out.println(sub);
		}
	}
	}
	}

	
