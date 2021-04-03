package alura.java.orientacao.objetos;

import java.util.Objects;

public class Student {

    private final Integer id;
    private final String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Student: " + this.name + ", id: " + this.id;
    }

    @Override
    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) return true;
        if (objectToCompare == null || this.getClass() != objectToCompare.getClass()) return false;
        Student student = (Student) objectToCompare;
        return Objects.equals(this.name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
