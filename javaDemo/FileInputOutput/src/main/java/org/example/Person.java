package org.example;

public class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(Person o) {
        return this.name.equals(o.name) ? 0 : 1;
    }
}
