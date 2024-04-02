//COMP 009 BSIT2 ASSIGNMENT#3:DATA STRUCTURE - EGAMEN, JAN LEO B

import java.util.Scanner;

public class ClassificationMain{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		ClassificationFunctions food = new ClassificationFunctions();
		
		do {
		System.out.println("Main Menu");
		System.out.println("1 Display in bullet form");
		System.out.println("2 Display in tree structure");
		System.out.println("3 Exit");
		System.out.print("Enter choice: ");
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1: 
				food.PrintinBullet();
			break;
		case 2: 
			food.PrintinTree();
			break;

		case 3:
			System.exit(0);
			System.out.println("Exiting...");
			System.out.println("Thank you...");
			break;


		default:
			System.out.println("Invalid input, please retry...");
			break;

		}
		
		System.out.println();
		System.out.println("----------------------");
		}while(choice!=3);
		
		}

}
