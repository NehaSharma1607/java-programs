package my_package;

class CustomException extends Exception{
	CustomException(String a){
		super(a);
	}
}
public class ConstructorUserDefinedException {
	static void method(int a) throws CustomException{
		if(a==1) {
			throw new CustomException("Custom Exception using method");
		}
		else {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		
		try {
			method(1);
			throw new CustomException("Custom Exception using constructor");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
