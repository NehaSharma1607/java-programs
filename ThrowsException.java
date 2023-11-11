package my_package;

public class ThrowsException {
	int division(int a,int b) throws ArithmeticException{
		int t=a/b;
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException obj=new ThrowsException();
		try {
			System.out.println(obj.division(15, 0));
			
			throw new NullPointerException();
		}
		catch(ArithmeticException e) {
			System.out.println("you should divide number by zero.");
		}

	}

}
