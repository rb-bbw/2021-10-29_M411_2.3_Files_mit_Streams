package ch.bbw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class OutputExample {

	public static void main(String[] args) {
		File file = new File("resources/output.txt");

		try {
			BufferedReader in = new BufferedReader( new InputStreamReader(System.in, StandardCharsets.UTF_8) );

			PrintWriter out = new PrintWriter(new FileWriter(file));
			String s;
			System.out.print("Enter text");
			System.out.println("[Type ctrl-d to stop.]:");

			// Read each input line and write it to the file.
			while ((s = in.readLine()) != null)  {
				out.println(s);
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
