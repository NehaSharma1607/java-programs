package my_package;

public class ExitInException {

	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3,4,5,6,7,8};
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=5) {
					System.out.println("exiit..");
					System.exit(0);
				}
				else {
					System.out.println("arr["+i+"] ="+arr[i]);
				}
				
			}
			arr[20]=34;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this is finally block");
		}
		System.out.println("End of program");
	}

}
