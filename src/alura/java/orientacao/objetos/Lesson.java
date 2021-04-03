package alura.java.orientacao.objetos;

public class Lesson implements Comparable<Lesson> {

    private final String name;
    private final Integer durationMinutes;

    public Lesson(String name, Integer durationMinutes) {
        if (name == null) {
            throw new NullPointerException("Name is required");
        }

        this.name = name;
        this.durationMinutes = durationMinutes;
    }

    public String getName() {
        return this.name;
    }

    public Integer getDurationMinutes() {
        return this.durationMinutes;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Duration: " + this.durationMinutes + "min";
    }

    @Override
    public int compareTo(Lesson comparedLesson) {
        return this.name.compareTo(comparedLesson.name);
    }
}
