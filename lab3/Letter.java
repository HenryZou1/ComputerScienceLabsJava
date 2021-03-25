public class Letter
{
   //-----------Start below here. To do: approximate lines of code = 16
   //
   /**
    * Create 3 instance variables of type String. One for
    * the sender of the letter, one for the recipient, one for the
    * text of the letter. Create a 4th instance variable of type int
    * representing the number of lines in the text of the letter.
    */
   private String sender;
   private String recipient;
   private String text;
   private int line;
   
   
   
   
   /**
      Create a constructor method with 2 parameters, each of type String, one to initialize the
      sender and one to initialize the recipient. Set the text to the emtpy
      string. Set the number of Lines to 0
   */
   
   public Letter(String sender, String Receiver){
	this.sender = sender;
	this.recipient = Receiver;
	text = "";
	line = 0;
   }
   
   
   
   
   
   
   /**
      Create a public method addLine(String line) that concatenates the string
      "\n" to the instance variable text you created above, then concatenates the given String parameter line to the 
      instance variable text that you created above. Increment the number of lines variable by 1.
   */
   
   public void addLine(String line){
   text +="\n" + line;
   
   this.line +=1;
   }
   
   
   
   
   /**
      Create a public method getText() that returns a String containing:
      "Dear " followed by the recipient name followed by ":\n" followed
      by the text of the letter followed by "\n\nSincerely,\n" followed by the
      sender name
   */
   
   public String getText(){
	return("Dear " +recipient+":\n"+ text + "\n\nSincerely,\n" + sender);
   }
   
   
   
   /**
    * Create a public method getNumberOfLines() that returns the value of the
	* number of lines instance variable
    * 
    */
   
   public int getNumberOfLines(){
	return line;
   }
   
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   
}
