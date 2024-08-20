package Practice;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		Scanner ask = new Scanner(System.in);

		int season;
		
		System.out.println("Enter the name of Month: ");
		season = ask.nextInt();
		
		if(season == 12 || season == 1 || season == 2 ) {
			
			System.out.println("Winters");
			
		}
		else if(season == 3 || season == 4 || season == 5 || season == 6 ) {
			
			System.out.println("Spring");
			
		}
		else if(season == 7 || season == 8 || season == 9 || season == 10 || season == 11 ) {
			
			System.out.println("Summer + Winters");
			
		}
		
		else {
			
			System.out.println("Not Exist Season...........");
		}
	}

}
