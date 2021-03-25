/**
   Based on P6.1. This program reads 12 temperatures corresponding to 12 months,
   and prints the month number with the highest average temperature,
   followed by the month number with the lowest average temperature.
 */
import java.util.* ;

public class MaxFinder
{
    public static void main(String[] args)
    {
	//average high temperatures for Toronto according to gocanada.
	String temperatures = "-2 -1 4 11 18 24 27 26 21 14 7 0" ;

	Scanner scanner = new Scanner(temperatures) ;
	int hottestTemp = 0 ;
	int hottestMonth = 0 ;
	int coldestTemp = 0 ;
	int coldestMonth = 0 ;

	//-----------Start below here. To do: approximate lines of code = 14
	// 0. initialize month 
	int month = 0;
	//1. write a while loop that reads temperatures from scanner (assume you do not know how many values there will be, so use the hasNextInt() method) ; 
	// Hint: use scanner.hasNextInt() in the loop condition
	// Don't forget to increment variable month
	int temp;
	while(scanner.hasNextInt()){
	    temp = scanner.nextInt();
	    month ++;
		if (month == 0 || hottestTemp < temp){
		    hottestMonth = month;
		    hottestTemp = temp;
		}
	    if ( month == 0 || coldestTemp>temp){
		coldestMonth = month;
		coldestTemp = temp;
	    }
	}
	    //2. if this is the first month or an extreme month, update the hottestMonth,hottestTemp or coldestMonth,coldestTemp variables ;
        // an extreme month means the temperature for this month is > the current hottest temperature or 
        // the temperature is < the current coldest temperature. That is, write two if statements and corresponding code - one for hottest check
        // and one for coldest 		
	
	
	
	
	
	
	
	
	
	//3. after the loop print the hottest month and coldest month in the style shown in the Expected region.
	System.out.println("Hottest month is " + hottestMonth +" (" + hottestTemp+" C)");
	System.out.println("Coldest month is " + coldestMonth +" (" + coldestTemp+" C)");
	
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	System.out.println("Expected: ") ;
	System.out.println("Hottest month is 7 (27 C)") ;
	System.out.println("Coldest month is 1 (-2 C)") ;
	scanner.close() ;
	System.out.println("######### Switching planets! #############") ;
	Random random = new Random(33) ;
	temperatures = "" ;
	final int MONTHS = random.nextInt(50) + 1 ;
	for (int i = 0 ; i < MONTHS ; i++)
	    if (i < MONTHS  / 2)
		temperatures += " " + "-" + random.nextInt(1000) ;
	    else
		temperatures += " " + random.nextInt(1000) ;
	Scanner scanner2 = new Scanner(temperatures) ;
	//-----------Start below here. To do: approximate lines of code = 14
	// 1. repeat your code from the above todo region (removing repeated declarations, if necessary, so that now the calculation is done for this random planet.
	hottestTemp = 0 ;
	hottestMonth = 0 ;
	coldestTemp = 0 ;
	coldestMonth = 0 ;
	month = 0;
	while(scanner2.hasNextInt()){
	    temp = scanner2.nextInt();
	    month ++;
		if (month == 0 || hottestTemp < temp){
		    hottestMonth = month;
		    hottestTemp = temp;
		}
	    if ( month == 0 || coldestTemp>temp){
		coldestMonth = month;
		coldestTemp = temp;
	    }
	}
	System.out.println("Hottest month is " + hottestMonth +" (" + hottestTemp+" C)");
	System.out.println("Coldest month is " + coldestMonth +" (" + coldestTemp+" C)");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
