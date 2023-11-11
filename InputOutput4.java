package my_package;
import java.io.*;
public class InputOutput4 {

	public static void main(String[] args) {
		try {
			File file=new File("C:\\\\\\\\Users\\\\\\\\Vikrant\\\\\\\\eclipse-workspace\\\\\\\\Java_Project\\\\\\\\text2.txt");
			boolean fvar=file.createNewFile();
			if(fvar) {
				System.out.println("File has been created successfully");
			}
			else {
				System.out.println("File already present at the specified location");
			}
		}catch(IOException e) {
			System.out.println("Exception Occurred");
		}
	}

}
