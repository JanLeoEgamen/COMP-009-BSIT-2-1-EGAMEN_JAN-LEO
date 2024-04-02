//COMP 009 BSIT2 ASSIGNMENT#2:FIBONACCI SYSTEM - EGAMEN, JAN LEO B

//class for printing sequence in words, polymorphism in a way that they do the same task of printing sequence
public class FibonacciWord {

	public void PrintinWord(int numOfSequence) {
		NumberWords PrintSequence = new NumberWords();// intantation
		int firstElement = 0, secondElement = 1, fSequence = 0, counter = 0;

		while(counter<numOfSequence){
            
            //print the sequence in words using instantaion of NumberWords Class
            System.out.print(PrintSequence.PrintNumberWords(fSequence) + ", ");
            
            //get the sum
            fSequence = firstElement+secondElement;

            
            // for counter and setting new variables
            firstElement = secondElement;
            secondElement = fSequence;
            counter++;}
	}

}
