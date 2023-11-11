package my_package;

public class ThisKeyword {
	String name;
	int age;
	String state;
	ThisKeyword(String name,int age,String state){
		name=name;
		this.age=age;
		state=state;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj=new ThisKeyword("neha",18,"living");
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.state);

	}

}
