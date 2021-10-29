package ch.bbw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CapsLocker {

	public static void main(String[] args) {
		File file = new File("resources/output.txt");

		try {
			BufferedReader in = new BufferedReader(new FileReader(file));

			in.lines().forEach( (line) -> System.out.println("line: " + line.toUpperCase()) );

			in.close(); // explicitly close, not necessary
		}
		catch (FileNotFoundException e1) {
			System.err.println("File not found: " + file);
		}
		catch (IOException e2) {
			e2.printStackTrace();
		}
	}

}
