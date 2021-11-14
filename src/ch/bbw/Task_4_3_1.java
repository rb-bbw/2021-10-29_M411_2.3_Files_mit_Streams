package ch.bbw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Task_4_3_1 {
    public static void main(String[] args) {
        try {
            Stream<String> lines = new BufferedReader(new FileReader("resources/wiesel.txt")).lines();
            PrintWriter pw = new PrintWriter("resources/wiesel_4.3.1.txt");

            lines.forEach(l -> {
                String[] values = l.split(" ");

                for(String i : values){
                    pw.printf("%s ", reverse(i.toLowerCase()));
                }
                pw.printf("%n"); // newline
            });

            //pw.flush(); // dump the content of the buffer to the file
            pw.close(); // same as flush, and close file (it is no longer available for writing)
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String reverse_charArray(String input) {
        char[] temp = input.toCharArray();
        String output = "";
        for(int i = temp.length - 1; i >= 0; i--) {
            output += temp[i];
        }

        return output;
    }
    private static String reverse_string(String input) {
        String output = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }

        return output;
    }
    private static String reverse(String input) {
        StringBuilder output = new StringBuilder(input);

        return output.reverse().toString();
    }
}
