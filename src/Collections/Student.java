package Collections;

import lombok.Data;

import java.util.Objects;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    String name;
    int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
