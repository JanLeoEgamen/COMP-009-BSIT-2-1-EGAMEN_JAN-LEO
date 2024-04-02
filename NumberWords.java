//COMP 009 BSIT2 ASSIGNMENT#2:FIBONACCI SYSTEM - EGAMEN, JAN LEO B
public class NumberWords {

	// Arrays to hold word representations for units, teens, tens, and thousands
    private static final String[] UNITS = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] TEENS = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    // Methods thatConvert a given number into its word representation.
 
    public String PrintNumberWords(int number) {
    	StringBuilder words = new StringBuilder(); // StringBuilder to build the word representation
        int index = 0; // Index to track the current chunk (thousands, millions, etc.)

    	//validation
    	if (number == 0) {
        System.out.print("Zero");
        }
        
        // Loop until the entire number is converted
        do {
            int chunk = number % 1000; // Extract the last three digits of the number
            if (chunk != 0) { // Skip chunks that are zero
                StringBuilder chunkWords = new StringBuilder(); // StringBuilder to hold the word representation of the chunk
                
                // Process the chunk
                if (chunk >= 100) { // Handle hundreds place
                    chunkWords.append(UNITS[chunk / 100]).append(" Hundred "); // Append word for hundreds place
                    chunk %= 100; // Remove hundreds place from the chunk
                }
                if (chunk >= 11 && chunk <= 19) { // Handle teens
                    chunkWords.append(TEENS[chunk - 10]).append(" "); // Append word for teens
                } else if (chunk == 10 || (chunk >= 20 && chunk <= 99)) { // Handle tens
                    chunkWords.append(TENS[chunk / 10]).append(" "); // Append word for tens
                    chunk %= 10; // Remove tens place from the chunk
                }
                if (chunk >= 1 && chunk <= 9) { // Handle units
                    chunkWords.append(UNITS[chunk]).append(" "); // Append word for units
                }
                
                // Insert chunk words and corresponding chunk denomination (thousands, millions, etc.) to the beginning of the result
                words.insert(0, chunkWords.toString() + THOUSANDS[index] + " ");
            }
            index++; // Move to the next chunk denomination
            number /= 1000; // Remove the last three digits from the number
        } while (number > 0); // Repeat until the entire number is converted
        
        return words.toString().trim(); 
        }


}
