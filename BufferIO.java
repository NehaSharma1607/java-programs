package my_package;
import java.io.*;
public class BufferIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis=null;
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\\\\\\\Users\\\\\\\\Vikrant\\\\\\\\eclipse-workspace\\\\\\\\Java_Project\\\\\\\\text.txt.txt");
			bis=new BufferedInputStream(fis);
			while(bis.available()>0) {
				System.out.print((char)bis.read());
			}
		}catch(FileNotFoundException e) {
			System.out.println("The specified file not found"+e);
		}catch(IOException e2) {
			System.out.println("I/O Exception "+e2);
		}
		finally {
			try {
				if(bis!=null && fis!=null) {
					fis.close();
					bis.close();
				}
			}catch(IOException e3) {
				System.out.println("Error in InputStream close() "+ e3);
			}
		}
}

}
