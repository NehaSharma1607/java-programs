package my_package;

public class ChainException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] numbers=new int[5];
			int divisor=0;
			for(int i=0;i<numbers.length;i++) {
				int result=numbers[i]/divisor;
				System.out.println(result);
			}
		}catch(ArithmeticException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
