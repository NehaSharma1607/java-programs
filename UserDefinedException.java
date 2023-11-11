package my_package;

class MyExp extends Exception{
	MyExp(String s) {
		super(s);
	}
}

public class UserDefinedException {
	
	public static void main(String[] args) throws MyExp{
		// TODO Auto-generated method stub
		MyExp obj=new MyExp("ajj");
		System.out.print(obj);
		

	}

}
