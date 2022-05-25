import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Krass", "Brut", 30, 80);
        human.setName("Markus");
        human.setSurname("Aurelius");
        human.setWeight(78);
        human.toString().lines().forEach(System.out::println);
        System.out.println(human.getName() + "\n" +
                human.getSurname() + "\n" +
                human.getAge() + "\n" +
                human.getWeight());
    }
}
