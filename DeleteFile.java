package my_package;
import java.io.*;
public class DeleteFile {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\Vikrant\\eclipse-workspace\\Java_Project\\text2.txt");
			if(file.delete()) {
				System.out.println(file.getName()+" is deleted");
			}
			else {
				System.out.println("File didnt delete");
			}
		}catch(Exception e) {
			System.out.println(" Exception occurred");
			e.printStackTrace();
		}
	}

}
