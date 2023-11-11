package my_package;
import java.util.*;
class Video{
	String title;
	boolean checkedOut=false;
	int avgRating=0;
	Video(String title){
		this.title=title;
	}
	void checkOut() {
		checkedOut=true;
	}
	void returned() {
		checkedOut=false;
	}
	void giveRating(int rating) {
		if(avgRating==0) {
			avgRating=rating;
			return;
		}
		else {
		avgRating=(avgRating+rating)/2;
		}
	}
}
class VideoStore {
	
	Video[] VideoList=new Video[10];
	static int index=0;
	void addVideo(String title) {
		if(index>9) {
			System.out.println("Store is full");
		}
		for(Video ob:VideoList) {
			if(ob==null) {
				VideoList[index]=new Video(title);
				index++;
				return;
			}
			if(ob.title.equals(title)) {
				System.out.println("video already exists");
				return;
			}
		}
	}
	void checkingOut(String title) {
		for(Video ob:VideoList) {
			if(ob==null) {
				System.out.println("we dont have this video");
			}
			if(ob.title.equals(title)) {
				if(ob.checkedOut==false) {
					ob.checkOut();
					return;
				}
				else {
					System.out.println("book is not available");
					return;
				}
			}
		}
	}
	void returnVideo(String title) {
		for(Video ob:VideoList) {
			if(ob==null) {
				System.out.println("The video not from us");
				return;
			}
			else if(ob.title.equals(title)) {
				ob.returned();
				return;
			}
		}
	}
	void receiveRating(String title,int rate) {
		for(Video ob:VideoList) {
			if(ob==null) {
				System.out.println("video not in out store");
				return;
			}
			if(ob.title.equals(title)) {
				ob.giveRating(rate);
				return;
			}
		}
	}
	void listInventory() {
		if(index==0) {
			System.out.println("we have no videos currently");
		}
		else {
			for(Video ob:VideoList) {
				String avail;
				if(ob==null) {
					return;
				}
				if(ob.checkedOut==false) {
					avail="In Store";
				}
				else {
					avail="Not in store";
				}
				System.out.println("Name: "+ob.title+" |Rating: "+ob.avgRating+" |Availability: "+avail);
					
			}
		}
	}
}
public class VideoStoreLauncher {
	static void menu() {
		System.out.println("Select an option:");
		System.out.println("1.Add a Video");
		System.out.println("2.Borrow a Video");
		System.out.println("3.Return a Video");
		System.out.println("4.Give Rating");
		System.out.println("5.Show all Videos");
		System.out.println("6.Exit");
		System.out.println();
		System.out.print("Enter your choice: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoStore obj=new VideoStore();
		Scanner sc=new Scanner(System.in);
		int choice;
		int rate;
		String name;
		while(true) {
			menu();
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter the name of the video: ");
				name=sc.nextLine();
				obj.addVideo(name);
				System.out.println("Video Added!");
				System.out.println();
				break;
				
			case  2:
				System.out.println("Enter the name of the video: ");
				name=sc.nextLine();
				obj.checkingOut(name);
				System.out.println("Video Borrowed!");
				System.out.println();
				break;
			case 3:
				System.out.println("Enter the name of the video: ");
				name=sc.nextLine();
				obj.returnVideo(name);
				System.out.println("Video Returned!");
				System.out.println();
				break;
			case 4:
				System.out.println("Enter the name of the video: ");
				name=sc.nextLine();
				System.out.println("Enter the rating for the video(0 to 10): ");
				rate=sc.nextInt();				
				obj.receiveRating(name, rate);;
				System.out.println("Video Rated!");
				System.out.println();
				break;
			case 5:
				obj.listInventory();
				System.out.println();
				break;
			case 6:
				System.out.println("Bye!");
				System.out.println();
				return;
			default: System.out.println("Invalid choice made");
			}
		}
		
	}

}
