package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        task_3();
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
    private static void task_2_2_2() {
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
    private static void task_3() {
        try (Stream<String> lines = new BufferedReader(
                new FileReader("resources/personen.txt")).lines()) {

            lines.map(l -> l.split(";"))
                    .map(Person::new)
                    .sorted(new SortByFirstname().thenComparing(new SortByAge()))
                    .forEach(l -> {
                        System.out.println(l.getFirstname() + " " + l.getLastname() + " " + l.getAge());
                    });
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}