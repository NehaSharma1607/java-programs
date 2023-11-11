package my_package;
import java.io.*;
public class InputOutputEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream file1=new FileInputStream("C:\\Users\\Vikrant\\Desktop\\text.txt");
			FileOutputStream file2=new FileOutputStream("C:\\Users\\Vikrant\\Desktop\\text2.txt");
			int i=0;
			while((i=file1.read())!=-1) {
				file2.write(i);
			}
			file1.close();
		}catch(Exception e) {System.out.println(e);}

	}

}
