// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//          
// ****************************************************************
package labPackage;

import java.util.Scanner;

public class Factorials
{
    public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		char keepGoing = 'y';

		while (keepGoing == 'y' || keepGoing == 'Y')
		{
			System.out.print("Enter an integer: ");
			int val = in.nextInt();
			try {
				System.out.println("Factorial(" + val + ") = " 
						   + MathUtils.factorial(val));				
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			System.out.print("Another factorial? (y/n) ");
			keepGoing = in.next().charAt(0);
		}
    }
}
