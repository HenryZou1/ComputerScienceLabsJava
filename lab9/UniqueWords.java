import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * UniqueWords - Write a program that uses a TreeSet to print each
 * unique word from a file alphabetically

 * Based upon P16.1 in Big Java
 */
public class UniqueWords 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Set <String> words = readWords("wordlist.txt");
		for(String word : words)
			System.out.println(word);
	}
	
    /**
       Reads all words from a file and puts them into a set (a tree set)
       @param filename the name of the file
       @return a set with all lowercased words in the file. Here, a 
       word is a sequence of upper- and lowercase letters.
    */
    //-----------Start below here. To do: approximate lines of code = 6
    // 1. static method readWords returning a set of Strings ... FileNotFoundException
    public static Set readWords(String filename) throws FileNotFoundException
    {//opening of the method
	//2. let 'words' be a set of Strings, constructed as a TreeSet
	Set <String> results = new TreeSet<String>();
	File file = new File("wordlist.txt");

	Scanner sc = new Scanner(file).useDelimiter("\\W");	
	//3. let 'scanner' be based on a file with name 'filename'

	//4. let scanner useDelimiter any run of one or more (+) characters 
	//other than a-z or A-Z
    String i;
	//5. while scanner has another word
    while(sc.hasNext()){
		i = sc.next().toLowerCase();
		results.add(i);
	}
	    //6. Put the lower case version of that word into 'words'.
    
	return results; //returning the set of words from file 'filename'
    }//closing of the method
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
