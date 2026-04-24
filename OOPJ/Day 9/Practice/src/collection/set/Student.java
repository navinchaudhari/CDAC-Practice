package collection.set;

import java.util.*;

public class Student {
    int roll;
    String name;

    public Student() {
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student s = (Student) o;
        return (this.roll == s.roll && this.name.equals(s.name));
    }

    public int hashCode() {
        return Objects.hash(roll, name);
    }

    public String toString() {
        return "[Roll: " + roll + ", Name: " + name + "]";
    }
}
