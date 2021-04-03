package alura.java.orientacao.objetos;

import java.util.*;

public class Course {

    private final String name;
    private final String instructor;
    private List<Lesson> lessons = new LinkedList<>();
    private Set<Student> students = new HashSet<>();

    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return this.name;
    }

    public String getInstructor() {
        return this.instructor;
    }

    public List<Lesson> getLessons() {
        return this.lessons;
    }

    public void registerLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public Set<Student> getStudents() {
        return this.students;
    }

    public void registerStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Course: " + this.name + ", Instructor: " + this.instructor;
    }
}
