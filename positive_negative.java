import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class positive_negative
{
	public static void main (String[] args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the no.");
	int n = s.nextInt();
	if(n > 0)
	{System.out.println("the no. is positive" +n);
	}
	else if(n < 0)
	{System.out.println("the no. is negative" +n);
	}
	else
	{System.out.println("the no is neither positive nor negative" +n);
	}
	}}