package my_package;

public class ChainException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			NumberFormatException ex=new NumberFormatException("Exception");
			ex.initCause(new NullPointerException("this is actual cause of exception"));
			throw ex;
		}catch(NumberFormatException ex){
			System.out.println(ex);
			System.out.println(ex.getCause());
		}
	}

}
