package my_package;
import java.io.*;
public class ReadThenWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("C:\\Users\\Vikrant\\Desktop\\text2.txt");
			if(!f.exists()) {
				f.createNewFile();
			}
			FileOutputStream fos=new FileOutputStream(f);
			String stmt="helloooooooo";
			byte[] bstmt=stmt.getBytes();
			fos.write(bstmt);
			
			File f2=new File("C:\\\\Users\\\\Vikrant\\\\Desktop\\\\text.txt");
			if(!f2.exists()) {
				f2.createNewFile();
			}
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos2=new FileOutputStream(f2);
			int a;
			while((a=fis.read())!=-1) {
				fos2.write((char)a);
			}
			fis.close();
			fos.close();
			fos2.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
