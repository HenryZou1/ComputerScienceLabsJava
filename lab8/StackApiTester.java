import java.util.Stack ;
/**
    Practices using the Stack from the Java API.
 */
public class StackApiTester
{
    public static void main(String[] args)
    {
	Stack<String> stack = new Stack<String>() ;
	stack.push("horse") ;
	stack.push("cat") ;
	stack.push("dog") ;
	stack.push("cow") ;
	stack.push("mouse") ;
	System.out.println(stack.pop()) ;
	System.out.println(stack.pop()) ;
	System.out.println(stack.pop()) ;
	System.out.println(stack.peek()) ;
	System.out.println("stack is empty? " + stack.isEmpty()) ;
	System.out.println(stack.pop()) ;
	System.out.println("stack is empty? " + stack.isEmpty()) ;
	System.out.println(stack.pop()) ;
	System.out.println("stack is empty? " + stack.isEmpty()) ;
	//-----------Start below here. To do: approximate lines of code = 8
	// 1. make a stack that holds integers ; 
	Stack <Integer> q2 = new Stack<Integer>() ;
	//2. put in the integers from 1 to 100 that are divisible by 3 ; 
	for (int i = 0; i<100;i++)
		if(i %3 == 0)
			q2.push(i);
	//3. print the size of the queue
	System.out.println(q2.size()-1);
	//4. while not empty ; 
	int value;
	while (!q2.isEmpty())
		{
			value = q2.pop();
			if (value %9 == 0&& value != 0)
				System.out.println(value);
		}
	//2. push in the integers from 1 to 100 that are divisible by 3 ; 
	
	
	
	//3. print the size ; 
	
	//4. while stack not empty ; 
	
	    //5. let value hold pop ; 
	
	    //6. if value divisible by 9 then print it.
	
	
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
