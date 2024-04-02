//COMP 009 BSIT2 ASSIGNMENT#2:FIBONACCI SYSTEM - EGAMEN, JAN LEO B

//Inheritance, FibonacciNumber inherits FibonacciWord 
public class FibonacciNumber extends FibonacciWord{

	public void PrintNumber(int numOfSequence) {
        int firstElement = 0, secondElement = 1, fSequence = 0, counter = 0;

		while(counter<numOfSequence){
            //print the sum
            System.out.print(fSequence + ", ");
            
            //get the sum
            fSequence = firstElement+secondElement;
            // for counter and setting new variables
            firstElement = secondElement;
            secondElement = fSequence;
            counter++;
        }
	}

}
