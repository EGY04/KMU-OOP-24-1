// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//          
// ****************************************************************
package labPackage;

public class MathUtils
{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n)throws IllegalArgumentException
    {
    	if (n < 0) {
    		throw new IllegalArgumentException("Not defined for negative.");
    	}
    	if (n >= 17)
    	{
    		throw new IllegalArgumentException("Too large to be represented as an integer.");
    	}
		int fac = 1;
		for (int i=n; i>0; i--)
		    fac *= i;
		return fac;
    }


}
