package alura.java.orientacao.objetos;

public class Test {

    public static void main(String[] args) {
        Student nightcrawler  = new Student(1, "Kurt Wagner");
        Student wolverine = new Student(2, "James Howlett");
        Student iceman = new Student(3, "Robert Louis Drake");
        Student beast = new Student(4, "Henry Philip McCoy");

        Lesson defenseAgainstDarkArts = new Lesson("Defense Against the Dark Arts", 180);
        Lesson herbology = new Lesson("Herbology", 210);
        Lesson potions = new Lesson("Potions", 100);

        Course dangerRoom = new Course("Danger Room", "Charles Francis Xavier");

        dangerRoom.registerLesson(defenseAgainstDarkArts);
        dangerRoom.registerLesson(herbology);
        dangerRoom.registerLesson(potions);

        dangerRoom.registerStudent(nightcrawler);
        dangerRoom.registerStudent(wolverine);
        dangerRoom.registerStudent(iceman);
        dangerRoom.registerStudent(beast);

        System.out.println(dangerRoom);
        System.out.println(dangerRoom.getLessons());
        System.out.println(dangerRoom.getStudents());
    }
}
