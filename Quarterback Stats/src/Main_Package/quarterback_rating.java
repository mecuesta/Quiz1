package Main_Package;

// Import the Scanner Utility
import java.util.Scanner;



public class quarterback_rating {

	public static void main(String[] args) {
		// Asking for the 5 Stats for the QuarterBack
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of Touchdowns: ");
		int td = input.nextInt();
				
		System.out.print("Enter the number of Total Yards: ");
		int yards = input.nextInt();
		
		System.out.print("Enter the number of Interceptions thrown: ");
		int intercept = input.nextInt();
		
		System.out.print("Enter the number of completions: ");
		int comp = input.nextInt();
		
		System.out.print("Enter the number of passes attempted: ");
		int att = input.nextInt();
		
		//double rating = ((8.4 * yards) + (330 * td) + (100 * comp) - (200 * intercept))/att;
		// do the equations for the player's rating
		double a = (comp / att - .3) * 5;
		
		double b = ((yards/att) - 3) * .25;
		
		double c = (td/att) * 20;
		
		double d = 2.375 - ((intercept/att) * 25);
		
		// These are the constraints to make sure none are negative
		if (a<0) {
			a = 0;
			
		}
		if (b<0) {
			b = 0;
			
		}
			if (c<0){
			c = 0;
			
		}
		if (d<0) {
			d = 0;
			
		}
		// Final Calculation for rating
		double rating = (((a + b + c + d)/6) * 100);
		// Display the Rating for the user
		
		System.out.print("\n");
		// in the next line, I could'nt get the formatting to one digit
		System.out.print("The Player's Rating is: " + rating + "percent");
		
		//System.out.print("The Player's Rating is: " + rating + " percent");
		

	}

}
