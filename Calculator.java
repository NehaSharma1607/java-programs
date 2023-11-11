package my_package;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='+';
		int a=12,b=6;
		switch(c) {
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			default: System.out.println("Invalid Operator");
		}
	}
}
