package my_package;

public class FibonacciWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,i=2,a=0,b=1,c;
		System.out.print(a+" "+b);
		while(i<=n) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			i++;
		}
	}

}
