package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class TextCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input:");
        String input = in.nextLine();

        try (Stream<String> lines = new BufferedReader(
                new FileReader("resources/wiesel.txt")).lines()) {

            long amount = lines.filter(s -> s.contains(input))
                    .count();

            System.out.println(amount);
        }
        catch (IOException e) {
            e.printStackTrace();
        }  // Buffered reader will be closed since Stream implements AutoClosable
    }
}
