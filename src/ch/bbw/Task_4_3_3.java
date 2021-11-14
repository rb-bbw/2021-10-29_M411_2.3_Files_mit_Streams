package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task_4_3_3 {
    public static void main(String[] args) {
        try {
            Stream<String> lines = new BufferedReader(new FileReader("resources/noten.txt")).lines();
            PrintWriter pw = new PrintWriter("resources/noten_4.3.3.txt");

            pw.printf(
                    "%-13s%-13s%-13s%-13s%-13s%-13s%-13s%n",
                    "Fach",
                    "Note1","Note 2", "Note 3", "Note 4", "Note 5",
                    "Durchschnitt"
            );
            lines.forEach(l -> {
                String[] values = l.split(";");
                float avg = 0;

                pw.printf("%-13s", values[0]); // subject

                for(int i = 1; i <= 5; i++){ // print grades
                    if(i < values.length){ // if has grades
                        avg += Float.parseFloat(values[i]);
                        pw.printf("%-13s", values[i]); // grade
                    }
                    else {
                        pw.printf("%-13s", ""); // fill empty grades
                    }
                }

                pw.printf("%-13s%n", avg / (values.length - 1)); // average and newline
            });

            pw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
