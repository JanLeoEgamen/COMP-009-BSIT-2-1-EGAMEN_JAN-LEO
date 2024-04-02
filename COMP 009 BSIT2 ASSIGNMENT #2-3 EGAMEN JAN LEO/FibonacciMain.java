//COMP 009 BSIT2 ASSIGNMENT#2:FIBONACCI SYSTEM - EGAMEN, JAN LEO B

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		//variables to use
        
        //choices
        int numSequence, choice;
        
        //Instantation
        FibonacciNumber FibonacciSequence = new FibonacciNumber();
        Scanner Input = new Scanner(System.in);

        //input number of sequence
        System.out.print("Enter how many sequence:");
        numSequence = Input.nextInt();
       
        System.out.println("1 Numbers");
        System.out.println("2 Words");
        System.out.print("Please choose what would you like to display: ");

        choice = Input.nextInt();
        
        System.out.print("Fibbonacci Sequence: ");
        switch(choice) {
        //numbers
        case 1:
        	FibonacciSequence.PrintNumber(numSequence);
        	break;
        
        //words
        case 2:
        	FibonacciSequence.PrintinWord(numSequence);
        	break;
        
        	default:
        		System.out.println("Invalid choice, please retry...");
        }

	}

}
