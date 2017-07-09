import java.util.*;
import java.lang.*;
import java.io.*;
class digits
{
    public static void main(String args[])
    {   
        int i=0;
        System.out.print("Enter a Number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.println("Number of Digits present : "+i);
    }
}