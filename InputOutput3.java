package my_package;
import java.io.*;
public class InputOutput3 {

	public static void main(String[] args) throws IOException
	{
		FileReader fr=null;
		try {
			fr=new FileReader("C:\\\\Users\\\\Vikrant\\\\eclipse-workspace\\\\Java_Project\\\\text.txt.txt");
		}catch(FileNotFoundException fe) {
			System.out.println("File not found");
		}
		int ch;
		while ((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
		fr.close();
	}

}
