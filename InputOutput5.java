package my_package;
import java.io.*;
public class InputOutput5 {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		File file;
		String mycontent="This is my data djkj";
		try {
			file=new File("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Vikrant\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Java_Project\\\\\\\\\\\\\\\\text.txt.txt");
			fos=new FileOutputStream(file);
			if(!file.exists()) {
				file.createNewFile();
			}
			byte[] bytesArray=mycontent.getBytes();
			fos.write(bytesArray);
			fos.flush();
			System.out.println("file written");
		}catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				if(fos!=null) {
					fos.close();
				}
			}catch(IOException e2) {
				System.out.println("Error in closing the stream");
			}
		}
	}

}
