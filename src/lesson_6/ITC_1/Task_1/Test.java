package lesson_6.ITC_1.Task_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        PersonSuperComparator personSuperComparator = new PersonSuperComparator();

        Set<Person> set = new TreeSet(personSuperComparator);
        set.add(new Person(23, "Егор"));
        set.add(new Person(30, "Петр"));
        set.add(new Person(21, "Егор"));
        set.add(new Person(30, "Василий"));
        set.add(new Person(32, "Петр"));
        set.add(new Person(21, "Петр"));

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
