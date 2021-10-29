package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try (Stream<String> lines = new BufferedReader(
            new FileReader("resources/wiesel.txt")).lines()) {

            lines.filter(s -> s.length() > 20)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(10)
                .forEach(w -> System.out.printf("%s (%d)%n", w, w.length()));
        }
        catch (IOException e) {
            e.printStackTrace();
        }  // Buffered reader will be closed since Stream implements AutoClosable
    }
}