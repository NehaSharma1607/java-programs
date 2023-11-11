package my_package;
import java.io.*;
public class AppendFile {

	public static void main(String[] args) {
		try{
			String content=" the appended data";
			File file=new File("C:\\Users\\Vikrant\\eclipse-workspace\\Java_Project\\text.txt.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("data successfully appeneded");
		}catch(IOException e) {
			System.out.println("Ecxeption occurred");
			e.printStackTrace();
		}
	}

}
