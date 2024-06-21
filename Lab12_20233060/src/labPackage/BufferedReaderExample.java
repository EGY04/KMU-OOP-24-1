package labPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderExample {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String l;
		System.out.println("Enter text: ");
		try {
			while((l = in.readLine()) != null)
			{
				if (l.equals("quit")) break;
				
				StringTokenizer tokenizer = new StringTokenizer(l);
				int cnt = tokenizer.countTokens();
				System.out.println("There are " + cnt + " words in this line.");
				
				while(tokenizer.hasMoreTokens()) System.out.println(tokenizer.nextToken());
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
