package my_package;

public class Ifelse {
	public static void main(String[] args) {
		int n=46;
		if(n<50) {
			System.out.println("It is less than 50.");
			n=n+10;
			if(n<50) {
				System.out.println("It is still less than 50.");
			}
			else {
				System.out.println("It is more than 50.");

			}
		}
		else {
			System.out.println("This is more than 50. ");
		}
	}
}
