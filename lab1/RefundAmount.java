import java.util.Scanner;

public class RefundAmount
{
   public static void main(String[] args)
   {
	   System.out.println("Refund: " + refund(23000.0,2) + "   Expected: 3000.0") ;
	   System.out.println("Refund: " + refund(17500.0,4) + "   Expected: 8000.0") ;
	   System.out.println("Refund: " + refund(80000.0,9) + "   Expected: 0.0") ;
	   System.out.println("Refund: " + refund(35000.0,5) + "   Expected: 5000.0") ;
	   System.out.println("Refund: " + refund(35000.0,-1) + "   Expected: 0.0") ;
   }
	
	/**
      Calculates the refund amount based on income and no. of children.
            
      @param income 
      @param ch number of children
      @return refund amount
      
      return 0 unless:
      Income > 30000$ and <= 40000$ and ch >= 3, refund is 1000.0$ * ch
      Income > 20000$ and <= 30000$ and ch >= 2, refund is 1500.0$ * ch
      Income <= 20000$, refund is 2000.0$ * ch
      
      check to make sure ch > 0, return 0 if not
   */
   //-----------Start below here. To do: approximate lines of code = 9
   // write a static method called refund with the appropriate parameters and return type.  
    public static double  refund(double income, int child){
	if(income>30000&&income<=40000 &&child>=3)
	    return (double) (1000.0*child);
	    else if(income>20000&&income<=30000 && child>=2)
		return (double)(1500.0*child);
	    else if(income <=20000)
		return 2000*child;
		else
		    return 0.0;
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
