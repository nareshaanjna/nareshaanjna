/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.util.Scanner;

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LEAPYR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int yr;
		Scanner s = new Scanner(System.in);
		yr=s.nextInt();
		if(((yr%400)==0) || ((yr%100)==0) || ((yr%4)==0))
		{
			System.out.println("Leap yr");
		}
		else
		System.out.println("Not Leap yr");
	
	}
}