package my_package;
import java.io.*;

class Student implements Serializable{
	int id;
	transient String name;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
public class SerializationEx{
	
	public static void main(String[] args) throws IOException{
		Student s1=new Student(211,"ravi");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Vikrant\\eclipse-workspace\\Java_Project\\text.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		System.out.println("success");
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\Vikrant\\eclipse-workspace\\Java_Project\\text.txt"));
		Student s;
		try {
			s = (Student)in.readObject();
			System.out.println(s.id+" "+s.name);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		in.close();

		
		
	}

}
