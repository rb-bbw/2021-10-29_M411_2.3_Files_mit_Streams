package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_4_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input:");
        String input = in.nextLine();

        try (Stream<String> lines = new BufferedReader(
                new FileReader("resources/wiesel.txt")).lines()) {

            List<String> replace = lines
                    .map(s -> s.replaceAll(input, ""))
                    .collect(Collectors.toList());

            Files.write(Paths.get("resources/wiesel_out.txt"), replace);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
