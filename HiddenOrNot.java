package my_package;
import java.io.*;
public class HiddenOrNot {

	public static void main(String[] args) {
		File file=new File("C:\\\\Users\\\\Vikrant\\\\eclipse-workspace\\\\Java_Project\\\\text.txt.txt");
		if(file.isHidden()) {
			System.out.println("File is hidden");
		}
		else {
			System.out.println("file not hidden");
		}
	}

}
