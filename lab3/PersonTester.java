
public class PersonTester 
{
  public static void main(String[] args)
  {
	  
	  Person tom = new Person("Tom","O'Brien");
	  Person ali = new Person("Alireza","Sadeghian");
	  
	  // Expected output:
	  // Name = Tom O'Brien
	  // Initials = TO
      // Name = Alireza Sadeghian
      // Initials = AS
	  System.out.println("Name = " + tom.getFullName());
	  System.out.println("Initials = " + tom.getInitials());
	  
	  System.out.println("Name = " + ali.getFullName());
	  System.out.println("Initials = " + ali.getInitials());
  }
}
