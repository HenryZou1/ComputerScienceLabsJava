
public class LetterTester 
{
	public static void main(String[] args)
	{
		Letter dearJohn = new Letter("Sally","John");
		
		dearJohn.addLine("I'm sorry but it's just not going to work out.");
		dearJohn.addLine("I'm taking the dog.");
		dearJohn.addLine("I'm keeping the ring.");
		/**
		 * Expected Output:
		 * 
		 * Dear John:
         *
         * I'm sorry but it's just not going to work out.
         * I'm taking the dog.
         * I'm keeping the ring.
         *
         * Sincerely,
         * Sally
         *
		 * Letter length 3 lines
        */
		System.out.println(dearJohn.getText());
		System.out.println("\nLetter length " + dearJohn.getNumberOfLines() + " lines");
	}
}
