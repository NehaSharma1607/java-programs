package my_package;
import java.util.*;
public class UsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Whats your name: ");
		String n=sc.next();
		System.out.print("Whats your age: ");
		int a=sc.nextInt();
		System.out.print("Are you a student: ");
		boolean t=sc.nextBoolean();
		System.out.print("Whats your percentage: ");
		float p=sc.nextFloat();
		System.out.print("Hows everything going");//goes to the next line
		String h=sc.nextLine();
		System.out.print("Where you at: ");
		String c=sc.next();
		System.out.println(" ");
		System.out.println("this is your info:");
		System.out.println(n);
		System.out.println(a);
		System.out.println(t);
		System.out.println(p);
		System.out.println(h);
		System.out.println(c);



		
		
	}

}
