package lesson_6.ITC_1.Task_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        PersonSuperComparator personSuperComparator = new PersonSuperComparator();

        Set set = new TreeSet(personSuperComparator);
        set.add(new Person(23, "Егор"));
        set.add(new Person(21, "Пётр"));
        set.add(new Person(30, "Василий"));

        for (Object o : set) {
            System.out.println(o);
        }
    }
}