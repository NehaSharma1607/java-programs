package my_package;
import java.io.*;
public class ExceptionHandle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f=null;;
		try {
			f=new FileInputStream("C:\\\\Users\\\\Vikrant\\\\Desktop\\\\text.txt");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			if(f!=null) {
				try {
					f.close();
				}catch(IOException e) {
					System.out.print(e);
				}
			}
		}
	}
}
