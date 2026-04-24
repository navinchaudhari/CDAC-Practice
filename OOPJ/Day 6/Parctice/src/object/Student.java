package object;

import java.util.Objects;

public class Student {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        String s = "Student[roll = " + roll + ", name = " + name + "]";
        return s;
    }

    public int hashCode(){
        return Objects.hash(roll,name);
    }

    public boolean equals(Student s) {
        if (s == null)
            return false;
        if (this.roll == s.roll && this.name == s.name) {
            return true;
        }
        return false;
    }
}
