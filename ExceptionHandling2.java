package my_package;
import java.io.*;
public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("C:\\\\Users\\\\Vikrant\\\\Desktop\\\\text.txt")
		}catch(FileNotFoundException fe) {
			System.out.println("File not found");
		}
		try {
			int i=0;
			while((i=file.read())!=-1) {
				System.out.print((char)i);
			}
			file.close();
		}catch(IOException ioe) {
			System.out.println("IOEXception has occurredddddd");
		}
	}

}
