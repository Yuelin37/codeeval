package selfDescribingNumbers;

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
			char[] chars;

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				int result = 1, tmp = 0;
				// strLine = new StringBuilder(strLine).reverse().toString();
				chars = strLine.toCharArray();

				for (int i = 0; i < chars.length; i++) {
					if (chars[i] >= '0' && chars[i] <= '9') {
						// System.out.println(i + ": "+ (int) (chars[i] - 48)+
						// " result:" + result);
						tmp = (int) (chars[i] - 48);
						// System.out.println("search " + (char)(i+48) + " in "+
						// strLine + " found: "+ counter((char)(i+48),strLine));
						if (tmp != counter((char) (i + 48), strLine)) {
							result = 0;
						}

					}
				}
				System.out.println(result);

			}
			// Close the input stream
			in.close();

		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}

	static int counter(char chr, String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == chr)
				count++;
		}
		return count;
	}

}
