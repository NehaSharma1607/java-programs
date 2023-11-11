package my_package;

interface inter3{
	int a=10;
	//int b;
	void method3();
}
interface inter4{
	int a=5;
	void method3();
}

public class SingleInterface implements inter3,inter4{
	public void method3() {
		//b=10;
		System.out.println("method 3 ");
	}
	public static void main(String[] args) {
		inter3 obj=new SingleInterface();
		System.out.println(inter3.a+" interface 3 variable");
		System.out.println(inter4.a+" interface 4 variable");

		
	}

}
