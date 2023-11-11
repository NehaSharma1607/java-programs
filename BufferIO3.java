package my_package;

import java.io.*;

public class BufferIO3 {

	public static void main(String[] args) {
		BufferedWriter bw=null;
		File file;
		try {

			String mycontent="This is my data djkj";
			file=new File("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Vikrant\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Java_Project\\\\\\\\\\\\\\\\text.txt.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			bw.write(mycontent);
			System.out.println("file written");
		}catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				if(bw!=null) {
					bw.close();
				}
			}catch(IOException e2) {
				System.out.println("Error in closing the stream");
			}
		}
	}

}
