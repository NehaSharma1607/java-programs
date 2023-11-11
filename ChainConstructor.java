package my_package;

public class ChainConstructor {
	int age;
	String name;

	ChainConstructor(){
		this("Hello");
	}
	ChainConstructor(String s){
		this(6,"hi");
	}
	ChainConstructor(int a,String s){
		age=a;
		name=s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainConstructor obj=new ChainConstructor();
		System.out.println(obj.age);
		System.out.println(obj.name);


	}

}
