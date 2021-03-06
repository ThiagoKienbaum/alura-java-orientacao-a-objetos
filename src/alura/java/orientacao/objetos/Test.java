package alura.java.orientacao.objetos;

import java.io.File;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        String line = scanner.nextLine();
        Scanner lineScanner = new Scanner(line).useDelimiter(",");
        String courseName = lineScanner.next();
        String courseInstructor = lineScanner.next();

        Course dangerRoom = new Course(courseName, courseInstructor);

        scanner.close();

        Student nightcrawler  = new Student(1, "Kurt Wagner");
        Student wolverine = new Student(2, "James Howlett");
        Student iceman = new Student(3, "Robert Louis Drake");
        Student beast = new Student(4, "Henry Philip McCoy");

        Lesson defenseAgainstDarkArts = new Lesson("Defense Against the Dark Arts", 180);
        Lesson herbology = new Lesson("Herbology", 210);
        Lesson potions = new Lesson("Potions", 100);
        try {
            Lesson empty = new Lesson(null, null);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        dangerRoom.registerLesson(potions);
        dangerRoom.registerLesson(herbology);
        dangerRoom.registerLesson(defenseAgainstDarkArts);

        dangerRoom.registerStudent(nightcrawler);
        dangerRoom.registerStudent(wolverine);
        dangerRoom.registerStudent(iceman);
        dangerRoom.registerStudent(beast);

        List<Lesson> orderedLessons = new ArrayList<>(dangerRoom.getLessons());
        Collections.sort(orderedLessons);
        PrintWriter printWriter = new PrintWriter("output.txt");

        printWriter.println(dangerRoom);
        printWriter.println(orderedLessons);
        printWriter.println(dangerRoom.getStudents());
        printWriter.close();

        System.out.println(dangerRoom);
        System.out.println(orderedLessons);
        System.out.println(dangerRoom.getStudents());

        Student searchStudent = new Student(null, "Kurt Wagner");
        Boolean hasSearchedStudent = dangerRoom.getStudents().contains(searchStudent);
        System.out.println("Has searched student? " + (hasSearchedStudent ? "Yes" : "No"));

        Student studentSearchedById = dangerRoom.searchRegisteredStudentById(2);
        System.out.println(studentSearchedById);
    }
}
