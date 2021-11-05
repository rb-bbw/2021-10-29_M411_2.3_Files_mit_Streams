package ch.bbw;

import java.time.LocalDate;

public class Person {
    private String firstname;
    private String lastname;
    private int birthyear;
    private int age;

    public int getAge(){
        return LocalDate.now().getYear() - birthyear;
    }
    public String getFirstname(){ return this.firstname; }
    public String getLastname(){ return this.lastname; }

    // convenience constructor
    public Person(String... line){
        this.firstname = line[1];
        this.lastname = line[0];
        this.birthyear = Integer.parseInt(line[2]);
    }
}
