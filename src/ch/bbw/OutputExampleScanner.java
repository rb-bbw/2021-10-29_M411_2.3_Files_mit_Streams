package ch.bbw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputExampleScanner {

	public static void main(String[] args) {
		File file = new File("resources/output.txt");

		try {
			Scanner in = new Scanner(System.in);

			PrintWriter out = new PrintWriter(new FileWriter(file));

			System.out.print("Enter file text. ");
			System.out.println("[Type ctrl-d to stop.]");
			// Read each input line and write it to the file.
			while (in.hasNextLine()) {
				out.println(in.nextLine());
			}

			// Close the buffered reader and the file print writer.
			in.close();
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
