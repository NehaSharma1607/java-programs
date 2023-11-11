package my_package;

public class RunnableEx implements Runnable {
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableEx obj=new RunnableEx();
		Thread m=new Thread(obj);
		m.start();
	}

}
