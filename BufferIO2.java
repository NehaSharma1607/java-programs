package my_package;
import java.io.*;
public class BufferIO2 {

	public static void main(String[] args) {
		BufferedReader br=null;
		BufferedReader br2=null;
		try {
			br=new BufferedReader(new FileReader("C:\\\\\\\\Users\\\\\\\\Vikrant\\\\\\\\eclipse-workspace\\\\\\\\Java_Project\\\\\\\\text.txt.txt"));
			System.out.println("reading the file using readLine()");
			String contentLine=br.readLine();
			while(contentLine!=null) {
				System.out.print(contentLine);
				contentLine=br.readLine();
			}
			System.out.println();
			br2=new BufferedReader(new FileReader("C:\\\\\\\\Users\\\\\\\\Vikrant\\\\\\\\eclipse-workspace\\\\\\\\Java_Project\\\\\\\\text.txt.txt"));
			System.out.println("Reading the file using read()");
			int num=0;
			char ch;
			while((num=br2.read())!=-1) {
				ch=(char)num;
				System.out.print(ch);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
