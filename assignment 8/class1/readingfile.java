package class1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileReader;
import java.io.IOException;

public class readingfile {
	public static void main(String args[]) throws IOException{
		File file=new File("C:\\Users\\lenovo\\Desktop\\class1\\src\\abc.txt");
		FileReader in=new FileReader(file);
		try {
		int c;
		while((c=in.read())!=-1) {
			System.out.print((char)c);
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}finally {
			if(in!=null) {
				in.close();
			}
		}
		
	}
}
