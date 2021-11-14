package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class Task_3_a {
    public static void main(String[] args) {
        try (Stream<String> lines = new BufferedReader(
                new FileReader("resources/personen.txt")).lines()) {

            lines
                    .sorted(Comparator.comparingInt(String::length))
                    .forEach(l -> {
                        String[] values = l.split(";");

                        System.out.printf("%s %s %s%n", values[1], values[0], values[2]);
                        System.out.printf("Line length: %d%n", l.length());
                        System.out.printf("Number of words: %d%n%n", values.length);
                    })
            ;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
