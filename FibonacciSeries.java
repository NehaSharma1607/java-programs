package my_package;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=6,a=0,b=1,c;
		System.out.println(a+" "+b);
		for(int i=2;i<=6;i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;			
		}
	}
}
