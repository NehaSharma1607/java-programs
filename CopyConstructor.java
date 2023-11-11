package my_package;

public class CopyConstructor {
	int age;
	String name;
	int uid;
	CopyConstructor(int age,String name,int uid){
		this.age=age;
		this.name=name;
		this.uid=uid;
		System.out.println(age+" "+name+" "+uid);
	}
	CopyConstructor(CopyConstructor obj){
		age=obj.age;
		name=obj.name;
		uid=5886;
		System.out.println(age+" "+name+" "+uid);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructor obj=new CopyConstructor(25,"shrita",5893);
		CopyConstructor obj1=new CopyConstructor(obj);

	}

}
