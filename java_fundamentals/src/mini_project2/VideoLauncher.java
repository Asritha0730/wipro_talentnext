package mini_project2;

import java.util.Scanner;

public class VideoLauncher {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();
        int choice = 0;
        boolean choice1 = true;
        
        while(choice1) {
        	System.out.println("\nVideo Rental Inventory System Menu :");
            System.out.println("1. Add Video :");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1 :
        		System.out.println("Enter the name of the video you want to add :");
            	String vname = sc.nextLine();
            	vs.addVideo(vname);
            	
                break;
            case 2:
				System.out.println("Enter the name of the video you want to Check out :");
				String checkoutname = sc.nextLine();
				vs.doCheckOut(checkoutname);
            	break;
            case 3:
            	System.out.println("Enter the name of the video you want to return :");
				String namereturn = sc.nextLine();
				vs.doReturn(namereturn);
				break;
            case 4:
            	System.out.println("Enter the name of the video you want to add :");
            	String namereturn2 = sc.nextLine();
				System.out.println("Enter the rating for this video :");
            	int rating = sc.nextInt();
            	vs.receiveRating(namereturn2, rating);
            	break;
            case 5:
            	vs.listInventory();
                break;
            case 6:
            	System.out.println("Thank You....");
            	choice1=false;
            	break;
            default:
                System.out.println("Invalid choice. Try again."); 	
        }
          
        }
  }
}
