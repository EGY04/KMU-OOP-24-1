// **********************************************************************************
//   UpdateInventory.java        Author: Lewis/Loftus (with modification)
//
//   Demonstrates the use of character file I/O.
// **********************************************************************************

import java.io.*;
import java.util.StringTokenizer;

public class UpdateInventory
{
    // -------------------------------------------------------------------
    //  Reads data about a store inventory from an input file, creating
    //  an array of InventoryItem objects. For each inventory item, gets
    //  the number of additional units and updates the total units 
    //  available (restocks), then writes the updated inventory back to 
    //  the file.
    // -------------------------------------------------------------------
    public static void main (String[] args)
    {
	final int MAX = 100;
	InventoryItem[] items = new InventoryItem[MAX];
	StringTokenizer tokenizer;
	String line, name, file = "inventory.dat";
	int units, count = 0;
	int addedUnits;
	float price;


	try
	    {
		FileReader fr = new FileReader (file);
		BufferedReader inFile = new BufferedReader (fr);
		
		line = inFile.readLine();
		while (line != null)
		    {
			tokenizer = new StringTokenizer (line);
			name = tokenizer.nextToken();
			try
			    {
				units = Integer.parseInt (tokenizer.nextToken());
				price = Float.parseFloat (tokenizer.nextToken());
				items[count++] = new InventoryItem (name, units, price);
			    }
			catch (NumberFormatException exception)
			    {
				System.out.println ("Error in input. Line ignored.");
				System.out.println (line);
			    }
			line = inFile.readLine();
		    }
		inFile.close();
	
		System.out.println ("\nEnter the number of additional units of each item: ");

		// Set up the output file stream



		for (int scan = 0; scan < count; scan++)
		    {
			System.out.println (items[scan]);
		    }

		// Close the output file stream

	    }
	catch (FileNotFoundException exception)
	    {
		System.out.println ("The file " + file + " was not found.");
	    }
	catch (IOException exception)
	    {
		System.out.println (exception);
	    }
    }
}
