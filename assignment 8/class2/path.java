package class2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileReader;
import java.io.IOException;

public class path {
	public static void main(String args[]) throws IOException{
		File file=new File("C:\\Users\\lenovo\\Desktop\\class2\\src\\abcd.txt");
		FileReader in=new FileReader(file);
		try {
		int start;
		while((start=in.read())!=-1) {
			System.out.print((char)start);
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}finally {
			if(in==null) {
				in.close();
			}
		}
		
	}
}

