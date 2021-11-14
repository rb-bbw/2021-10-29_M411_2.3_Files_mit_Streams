package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task_2_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("First name:");
        String input = in.nextLine();

        try (Stream<String> lines = new BufferedReader(
                new FileReader("resources/personen.txt")).lines()) {

            lines.filter( s -> {
                String[] values = s.split(";");
                return values[1].contains(input);
            }).forEach(l -> {
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
