package swapCase;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream(args[0]);
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine, resultString;
			char[] chars;

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				chars = strLine.toCharArray();
				for (int i = 0; i < chars.length; i++) {
					if (chars[i] >= 'A' && chars[i] <= 'Z') {
						chars[i] += 32;
					}
					else if(chars[i] >= 'a' && chars[i] <= 'z') {
						chars[i] -= 32;
					}
				}
				resultString = String.valueOf(chars);
				System.out.println(resultString);
			}
			// Close the input stream
			in.close();

		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}

}
