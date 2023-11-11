package my_package;
import java.io.*;
public class RenameFile {

	public static void main(String[] args) {
		File oldfile=new File("C:\\Users\\Vikrant\\eclipse-workspace\\Java_Project\\text.txt");
		File newfile =new File("C:\\Users\\Vikrant\\eclipse-workspace\\Java_Project\\text.txt.txt");
		boolean flag=oldfile.renameTo(newfile);
		if(flag) {
			System.out.println("file is renamed");
		}
		else {
			System.out.println("File is not renamed");
		}
	}

}
