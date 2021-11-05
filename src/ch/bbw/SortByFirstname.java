package ch.bbw;

import java.util.Comparator;

public class SortByFirstname implements Comparator<Person> {
    public int compare(Person a, Person b) { return a.getFirstname().compareTo(b.getFirstname()); }
}
