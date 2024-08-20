package Practice;

import java.util.Scanner;

public class UserInput {
	
	String FirstName;
	String LastName;
	char Gender;
	int age;
	double height;
	
	public void input() {
	
		Scanner ask = new Scanner(System.in);
	
		System.out.println("Enter Your First Name:  ");
		FirstName = ask.next();
		
		System.out.println("Enter Your Last Name:   ");
		LastName = ask.next();
		
		System.out.println("Enter Your Gender M/F:   ");
		Gender = ask.next().charAt(Gender);
		
		System.out.println("Enter Your Age:   ");
		age = ask.nextInt();
		
		System.out.println("Enter Your Height:   ");
		height = ask.nextDouble();
		
	}
	
	
	public void displayinfo() {
		
		System.out.println("First Name: " + FirstName);
		System.out.println("Last Name: " + LastName);
		System.out.println("Gender:  " + Gender);
		System.out.println("Age:  " + age);
		System.out.println("Height:  " + height);
		
		
	}
}
