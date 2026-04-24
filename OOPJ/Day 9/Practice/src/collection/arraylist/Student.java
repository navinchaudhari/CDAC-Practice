package collection.arraylist;

import java.util.Objects;

public class Student {
    int rollNo;
    String name;
    float marks;

    public Student() {
    }

    public Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student s = (Student) o;
        return (this.rollNo == s.rollNo && this.marks == s.marks && this.name.equals(s.name));

    }

    public int hasCode() {
        return Objects.hash(rollNo, name, marks);
    }
}
