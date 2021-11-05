package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        task_2_2_1();
    }
    private static void task_2_2_1() {
        try (Stream<String> lines = new BufferedReader(
                new FileReader("resources/personen.txt")).lines()) {

            lines.forEach(l -> {
                String[] values = l.split(";");

                int year = LocalDate.now().getYear();
                int age = year - Integer.parseInt(values[2]);
                System.out.println(values[1] + " " + values[0] + " " + age);
            });
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}