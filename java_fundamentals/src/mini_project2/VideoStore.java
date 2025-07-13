package mini_project2;

public class VideoStore {
	
	private Video [] store = new Video[10];
	private int count =0;
	
	public void addVideo(String name) {
		store[count]= new Video(name);
		count++;
		System.out.println("video "+(name)+" added successfullyy");
	}
	public void doCheckOut(String name) {
		for(int i =0;i<count;i++) {
			if(store[i].getName().equalsIgnoreCase(name)) {
				store[i].doCheckOut();
				System.out.println("video "+(name)+" checked out successfullyy");
				return;
			}
		}
	}
	public void doReturn(String name) {
		for(int i =0;i<count;i++) {
			if(store[i].getName().equalsIgnoreCase(name)) {
				store[i].doReturn();
				
				System.out.println("video "+(name)+" returned successfullyy");
				return;
			}
		}
	}
	public void receiveRating(String name , int rating) {
		for(int i =0;i<count;i++) {
			if(store[i].getName().equalsIgnoreCase(name)) {
				store[i].receiveRating(rating);
				System.out.println("Rating "+(rating)+" has been mapped to the video "+(name));
				return;  
			}
		}
	}
	public void listInventory() {
		System.out.println("----------------------------------------------------");
		System.out.println("Video Name\t | \tChecked Out\t|\tRating\t ");
		System.out.println("----------------------------------------------------");
		for(int i =0;i<count;i++) {
			System.out.println(
					store[i].getName() + "\t\t\t" +
					store[i].getCheckOut() + "\t\t\t" +
					store[i].getRating()		
					
					);
		}
		System.out.println("----------------------------------------------------");
	}

}
