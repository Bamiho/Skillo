package ExerciseL9;

public class ExerciseL9 {
    public static void main(String[] args) {
        String validEGN = "8906154020";
        String invalidEGN = "B012345680";
        String validEGNAfter2000 = "2103201234";
        String validEGNBefore2000 = "9108223456";
        Person person = new Person("Dara", 'F', "atheist","bulgarian", "QA","Bulgarian", validEGN,"Bulgaria");
        System.out.println(person.birthDate);
        System.out.println(person.age);
    }
}
