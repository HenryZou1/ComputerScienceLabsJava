import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;

/**
   This program is an example from Big Java, Chapter 16.
   It prints the frequencies of all words in a given file.
   The basic idea is to make a map from word to frequency.
   For each word in the file, put it in the map with a frequency
   of one if it wasn't there already, otherwise increment its
   frequency.
*/
public class WordFrequency
{
   public static void main(String[] args) throws FileNotFoundException
   {
       //-----------Start below here. To do: approximate lines of code = 6
	   
       // 1. let frequencies be a map from String to Integer (a TreeMap)
       Map<String, Integer> frequencies = new TreeMap<String,Integer>();
       //2. let scanner be based on file "catInHat.txt"
         File file = new File("catInHat.txt");
		    Scanner scanner = new Scanner(file);
       while (scanner.hasNext()) { //
	   String word = clean(scanner.next());//
	 
			  if (!frequencies.containsKey(word))
				  frequencies.put(word, 1);
			  else
			  {
			    int count = frequencies.get(word);
			    frequencies.put(word,count+1);
			  }
	   //3. Integer count =  frequency of this word
       
	   //4. update count when it is null
       
	   //5. update count when it is not null
       
	   //6. update the map
       
       }//closing the while
       //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
       
       // Print all words and counts
       for (String key : frequencies.keySet()) {
	   System.out.printf("%-20s%10d\n", key, frequencies.get(key));
       }
   }
    /**
       Removes characters from a string that are not letters.
       @param str a string
       @return a string with all the letters from str
    */
    public static String clean(String str)
    {
	String result = "";
	for (int i = 0; i < str.length(); i++) {
	    char c = str.charAt(i);
	    if (Character.isLetter(c)) {
		result = result + c;
	    }
	}
	return result.toLowerCase();
    }
}
