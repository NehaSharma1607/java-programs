package my_package;

public class Continue {
	public static void main(String[] args) {
		//For loop
		for(int i=0;i<5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("");
		//while loop
		int j=0;
		while(j<=12) {
			if(j==7) {
				j++;
				continue;
			}
			System.out.println(j);
			j++;
		}
		System.out.println("");
		//do while loop
		int k=0;
		do {
			if(k==4) {
				k++;
				continue;
			}
			System.out.println(k);
			k++;
		}while(k<=6);
	}
}
