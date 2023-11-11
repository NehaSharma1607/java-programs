package my_package;

import java.io.*; class AppendPrintWriter {

	public static void main(String[] args) {
		try{
			File file=new File("C:\\Users\\Vikrant\\eclipse-workspace\\Java_Project\\text.txt.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.println(" this is using the printwriterclass");
			pw.close();
			System.out.println("data successfully appeneded");
		}catch(IOException e) {
			System.out.println("Ecxeption occurred");
			e.printStackTrace();
		}
	}

}
