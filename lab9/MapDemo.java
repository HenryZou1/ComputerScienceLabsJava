import java.awt.Color;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

/**
   This program is an example from Chapter 16 in Big Java.
   It demonstrates a map that maps names to colors.
   Expected output:

Adam : java.awt.Color[r=255,g=0,b=0]
Eve : java.awt.Color[r=0,g=0,b=255]
Juliet : java.awt.Color[r=0,g=0,b=255]
Romeo : java.awt.Color[r=0,g=255,b=0]
-------------------------------
Adam : java.awt.Color[r=255,g=0,b=0]
Eve : java.awt.Color[r=0,g=0,b=255]
Juliet : java.awt.Color[r=0,g=0,b=255]
Romeo : java.awt.Color[r=0,g=255,b=0]
*/
public class MapDemo
{
    public static void main(String[] args)
    {      
	Map<String, Color> favoriteColors = new TreeMap<String, Color>();
	favoriteColors.put("Juliet", Color.BLUE);
	favoriteColors.put("Romeo", Color.GREEN);
	favoriteColors.put("Adam", Color.RED);
	favoriteColors.put("Eve", Color.BLUE);
	
	// Print all keys and values in the map
	
	Set<String> keySet = favoriteColors.keySet();
	for (String key : keySet) {
	    Color value = favoriteColors.get(key);
	    System.out.println(key + " : " + value);
	}
	System.out.println("-------------------------------") ;
	//-----------Start below here. To do: approximate lines of code = 5
	// 1. make an iterator for keySet
	Iterator <String> iterator = keySet.iterator();
	String s;
	//2. while the iterator has more elements
	 while (iterator.hasNext()){
		s = iterator.next();
		System.out.println(s+":"+ favoriteColors.get(s));
	    //get the next element, which is a key of map favoriteColors
	
	    //get the corresponding value
	
	    //print the key value pair, as above
	
	}//closing brace of while
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
