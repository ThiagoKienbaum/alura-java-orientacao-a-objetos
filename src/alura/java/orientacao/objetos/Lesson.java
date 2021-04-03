package alura.java.orientacao.objetos;

public class Lesson {

    private final String name;
    private final Integer durationMinutes;

    public Lesson(String name, Integer durationMinutes) {
        this.name = name;
        this.durationMinutes = durationMinutes;
    }

    public String getName() {
        return this.name;
    }

    public Integer getDurationMinutes() {
        return this.durationMinutes;
    }

    public String toString() {
        return "Name: " + this.name + "Duration: " + this.durationMinutes + "min.";
    }
}
