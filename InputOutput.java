package my_package;
import java.io.FileInputStream;

public class InputOutput {

	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("C:\\Users\\Vikrant\\Desktop\\text.txt");
			int i=0;
			while((i=file.read())!=-1) {
				System.out.print((char)i);
			}
			file.close();
		}catch(Exception e) {System.out.println(e);}
	}

}
