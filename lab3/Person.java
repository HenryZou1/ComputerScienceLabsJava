public class Person
{
   //-----------Start below here. To do: approximate lines of code = 9
   //
   // Create two instance variables
   // One holds the first name of a person and one holds the last name
   // Both are strings
   private String first;
   private String last;
   
   
   // Create a Constructor Method with two arguments to set the
   // first and last name instance variables 
   public Person(String first, String last){
	this.first = first;
	this.last = last;
   }
   
   
   
   
   
   // Create a public method called getFullName() that returns a string containing
   // the first name followed by a blank space followed by the last name
   
   public String getFullName(){
	return first + " " + last;
   }
   
   
   
   // Create a public method call getInitials() that returns a string containing the
   // first letter of the first name followed by the first letter of 
   // the last name. Hint: use the substring method of class String. For example,
   // if a String object called s contains the string "abcdefg" then 
   // s.substring(2,4) returns the string "cd"
   public String getInitials(){
	return first.substring(0,1) + last.substring(0,1);
   }
   
   
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
