package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Task_3 {

    public static void main(String[] args) {
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