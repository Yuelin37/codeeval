package LongestWord;

import java.io.*;

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
				String[] words = strLine.split(" ");
				String longest = "";
				if (words.length == 1) {
					longest = words[0];
				} else {
					int curLength = 0;

					for (int i = 0; i < words.length; i++) {
						if (words[i].length() > curLength) {
							longest = words[i];
							curLength = words[i].length();
						}
					}
				}
				System.out.println(longest);
			}
			// Close the input stream
			in.close();

		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}
}
