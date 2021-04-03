package alura.java.orientacao.objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Course {

    private final String name;
    private final String instructor;
    private final List<Lesson> lessons = new ArrayList<>();
    private final Set<Student> students = new HashSet<>();
    private final Map<Integer, Student> idToStudent = new HashMap<>();

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
        return Collections.unmodifiableList(this.lessons);
    }

    public void registerLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(this.students);
    }

    public void registerStudent(Student student) {
        this.students.add(student);
        this.idToStudent.put(student.getId(), student);
    }

    public Student searchRegisteredStudentById(Integer id) {
        return idToStudent.get(id);
    }

    @Override
    public String toString() {
        return "Course: " + this.name + ", Instructor: " + this.instructor;
    }
}
