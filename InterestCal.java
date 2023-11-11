package my_package;
import java.util.*;
abstract class Account{
	double interestRate;
	double amount;
	abstract double calculateInterest();
	
	
}
class FDAccount extends Account{
	double amount;
	int noOfDays;
	int ageOfACHolder;
	void data(int amount, int noOfDays, int ageOfACHolder) {
		this.amount=amount;
		this.noOfDays = noOfDays;
		this.ageOfACHolder = ageOfACHolder;
	}
	void InterestRate() {
		if(amount<10000000) {
			if (noOfDays >= 7 && noOfDays <= 14) {
	        	if(ageOfACHolder>=60){
	        		interestRate=0.0500;
	        	}
	        	else {
	        		interestRate=0.0450;
	        	}
	        } 
	        else if (noOfDays >= 15 && noOfDays <= 29) {
	        	if(ageOfACHolder>=60){
	        		interestRate=0.0525;
	        	}
	        	else {
	        		interestRate=0.0475;
	        	}
	        } 
	        else if (noOfDays >= 30 && noOfDays <= 45) {
	        	if(ageOfACHolder>=60){
	        		interestRate=0.0600;
	        	}
	        	else {
	        		interestRate=0.0550;
	        	}
	        } 
	        else if (noOfDays >= 45 && noOfDays <= 60) {
	        	if(ageOfACHolder>=60){
	        		interestRate=0.0750;
	        	}
	        	else {
	        		interestRate=0.0700;
	        	}
	        } 
	        else if (noOfDays >= 61 && noOfDays <= 184) {
	        	if(ageOfACHolder>=60){
	        		interestRate=0.0800;
	        	}
	        	else {
	        		interestRate=0.0750;
	        	}
	        } 
	        else{
	        	if(ageOfACHolder>=60){
	        		interestRate=0.0850;
	        	}
	        	else {
	        		interestRate=0.0800;
	        	}
	        } 		
		}
		else {
			if (noOfDays >= 7 && noOfDays <= 14) {
				interestRate=0.0650;
			}
			else if (noOfDays >= 15 && noOfDays <= 29) {
				interestRate=0.0675;
			}
			else if (noOfDays >= 30 && noOfDays <= 45) {
				interestRate=0.0675;
			}
	        else if (noOfDays >= 45 && noOfDays <= 60) {
	        	interestRate=0.0800;
	        }
	        else if (noOfDays >= 61 && noOfDays <= 184) {
	        	interestRate=0.0850;
	        }
			else{
				interestRate=0.01000;
			}			
		}
	}
	double calculateInterest() {
		InterestRate();
		return interestRate*amount;
	}
}
class RDAccount extends Account{
	double amount;
	int noOfMonths;
	int ageOfACHolder;
	void data(int amount, int noOfMonths, int ageOfACHolder) {
		this.amount=amount;
		this.noOfMonths = noOfMonths;
		this.ageOfACHolder = ageOfACHolder;
	}
	void InterestRate() {
		if(noOfMonths==6) {
			if(ageOfACHolder>=60){
        		interestRate=0.0800;
        	}
        	else {
        		interestRate=0.0750;
        	}
		}
		else if(noOfMonths==9) {
			if(ageOfACHolder>=60){
        		interestRate=0.0825;
        	}
        	else {
        		interestRate=0.0775;
        	}
		}
		else if(noOfMonths==12) {
			if(ageOfACHolder>=60){
        		interestRate=0.0850;
        	}
        	else {
        		interestRate=0.0800;
        	}
		}
		else if(noOfMonths==15){
			if(ageOfACHolder>=60){
        		interestRate=0.0875;
        	}
        	else {
        		interestRate=0.0825;
        	}
		}
		else if(noOfMonths==18) {
			if(ageOfACHolder>=60){
        		interestRate=0.0900;
        	}
        	else {
        		interestRate=0.0850;
        	}
		}
		else if(noOfMonths==21) {
			if(ageOfACHolder>=60){
        		interestRate=0.0925;
        	}
        	else {
        		interestRate=0.0875;
        	}
		}
		else {
			System.out.println("No such plan exists!");
		}
	}
	double calculateInterest() {
		InterestRate();
		return interestRate*amount;
	}
}
class SBAccount extends Account{
	double amount;
	String AcType;
	void data(String AcType,int amount) {
		this.AcType=AcType;
		this.amount=amount;
	}
	void InterestRate() {
		if(AcType.equals("NRI")) {
			interestRate=0.04;
		}
		else if(AcType.equals("Normal")){
			interestRate=0.06;
		}
		else {
			System.out.println("No such plan exists!");
		}
	}
	double calculateInterest() {
		InterestRate();
		return interestRate*amount;
	}
}
class UnAcceptableException extends Exception{
	 public UnAcceptableException (String str)  {    
       super(str);  
   }  
}
public class InterestCal {
	static Scanner sc=new Scanner(System.in);
	static void menu() {
		System.out.println("Select the option");
		System.out.println("1. Interest Calculator:FD");
		System.out.println("2. Interest Calculator:RD");
		System.out.println("3. Interest Calculator:SB");
		System.out.println("4. Exit");
		System.out.println("Enter your choice: ");
	}
	static void correct(int value,int flag) throws UnAcceptableException{
		if(flag == 0) {
			if(value<1 || value>150) {
				throw new UnAcceptableException("Enter a valid Age");
			}
		}
		else if(flag == 1) {
			if(value<0) {
				throw new UnAcceptableException("Amount cannot be negative");
			}
		}
		else if(flag == 2) {
			if(value<7 || value>365) {
				throw new UnAcceptableException("Enter valid number of days within (7-365)");
			}
		}
		else {
			if(value!=6 && value!=9 && value!=12 && value!=15 && value!=18 && value!=21){
				throw new UnAcceptableException("Enter valid number of months");
			}
		}
	}
	static String ACType() {
		System.out.println("Choose account type: ");
		System.out.println("1.NRI");
		System.out.println("2.Normal");
		int choice=sc.nextInt();
		if(choice==1) {
			return "NRI";
		}
		else if(choice==2) {
			return "Normal";
		}
		else {
			return "wrong";
		}
	}
	
	public static void main(String[] args) {
		int choice;
		String ACType;
		int amount;
		int noOfDays;
		int noOfMonths;
		int flag;
		int age;
		FDAccount fda=new FDAccount();
		RDAccount rda=new RDAccount();
		SBAccount sba=new SBAccount();
		while(true) {
			menu();
			flag=0;
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Amount: ");
				amount=sc.nextInt();
				try {
					correct(amount,1);
				}catch(Exception e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.println("Enter no of days: ");
				noOfDays=sc.nextInt();
				try {
						correct(noOfDays,2);
					}catch(Exception e) {
						System.out.println(e.getMessage());
						break;
				}
				System.out.println("Enter your age: ");
				age=sc.nextInt();
				try{
					correct(age,0);
				}catch(Exception e) {
					System.out.println(e.getMessage());
					break;
			    }
				fda.data(amount,noOfDays,age);
				System.out.println("Interest gained: "+fda.calculateInterest());
				break;
				
			case 2:
				System.out.print("Enter amount: ");
				amount=sc.nextInt();
				try {						
					correct(amount,1);
				}catch(Exception e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.print("Enter number of months(6/9/12/15/18/21): ");
				noOfMonths= sc.nextInt();
				try {						
					correct(noOfMonths,3);
				}catch(Exception e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.print("Enter Age: ");
				age = sc.nextInt();
				try {						
					correct(age,0);
				}catch(Exception e) {
					System.out.println(e.getMessage());
					break;
				}
				rda.data(amount,noOfMonths,age);
				System.out.println("Interest Gained is: "+rda.calculateInterest());
				break;
				
			case 3:
				System.out.print("Enter Amount: ");
				amount=sc.nextInt();
				try {						
					correct(amount,1);
				}catch(Exception e) {
					System.out.println(e.getMessage());
					break;
				}
				ACType = ACType();
				sba.data(ACType, amount);
				System.out.println("Interest Gained is: "+sba.calculateInterest());
				flag=1;
				break;
				
			case 4:
				System.out.println("See you again! Bye!.");
				return;
				
			default: System.out.println("Invalid choice is made");flag=1;	
			}
			if(flag==0) {
				sc.nextLine();
			}
		}
	}
}
