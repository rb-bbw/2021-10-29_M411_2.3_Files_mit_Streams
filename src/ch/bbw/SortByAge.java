package ch.bbw;

import java.util.Comparator;

public class SortByAge implements Comparator<Person> {
    public int compare(Person a, Person b) { return (Integer.compare(a.getAge(), b.getAge())); }
}
