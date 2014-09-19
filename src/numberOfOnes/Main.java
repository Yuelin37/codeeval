/*
CHALLENGE DESCRIPTION:
Write a program to determine the number of 1 bits in the internal representation of a given integer.

INPUT SAMPLE:
The first argument will be a path to a filename containing an integer, one per line. E.g.
10
22
56

OUTPUT SAMPLE:
Print to stdout, the number of ones in the binary form of each number. E.g.
2
3
3
*/


package numberOfOnes;

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
			String strLine;

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Convert string to decimal integer, then convert decimal int to binary string
				String num = Integer.toBinaryString(Integer.parseInt(strLine));
				// Remove '0' in the string and count '1'
				System.out.println(num.replace("0", "").length());

			}
			// Close the input stream
			in.close();

		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}

}
