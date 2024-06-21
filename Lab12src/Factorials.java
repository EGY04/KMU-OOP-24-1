// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//          
// ****************************************************************

import java.util.Scanner;

public class Factorials
{
    public static void main(String[] args)
    {
	char keepGoing = 'y';

	while (keepGoing == 'y' || keepGoing == 'Y')
	    {
		System.out.print("Enter an integer: ");
		int val = in.nextInt();
		System.out.println("Factorial(" + val + ") = " 
				   + MathUtils.factorial(val));
		System.out.print("Another factorial? (y/n) ");
		keepGoing = in.next().charAt(0);
	    }
    }
}
