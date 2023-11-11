package my_package;
import java.io.*;
public class BufferedReaderAndFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader fr=new FileReader("C:\\\\Users\\\\Vikrant\\\\Desktop\\\\text.txt");
		BufferedReader br=new BufferedReader(new FileReader("C:\\\\Users\\\\Vikrant\\\\Desktop\\\\text.txt"));
		int a;
		while((a=fr.read())!=-1) {
			System.out.println("FileReader: "+(char)a);
		}
		String b;
		while((b=br.readLine())!=null) {
			System.out.println("BufferedReader: "+b);
		}
		fr.close();
		br.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
