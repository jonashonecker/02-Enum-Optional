import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.getDayAsString(DaysOfWeek.MONDAY));
        System.out.println(DaysOfWeek.getDayAsString(DaysOfWeek.TUESDAY));
        System.out.println(DaysOfWeek.getDayAsString(DaysOfWeek.WEDNESDAY));
        System.out.println(DaysOfWeek.getDayAsString(DaysOfWeek.THURSDAY));
        System.out.println(DaysOfWeek.getDayAsString(DaysOfWeek.FRIDAY));
        System.out.println(DaysOfWeek.getDayAsString(DaysOfWeek.SATURDAY));
        System.out.println(DaysOfWeek.getDayAsString(DaysOfWeek.SUNDAY));

        Person p1 = new Person("1", "Otto", DaysOfWeek.FRIDAY, Gender.MALE);
        Person p2 = new Person("2", "Nadine", DaysOfWeek.SATURDAY, Gender.FEMALE);
        Person p3 = new Person("3", "Friedrich", DaysOfWeek.SUNDAY, Gender.MALE);

        PersonRepository myPersons = new PersonRepository(
                Map.of(p1.id(), p1, p2.id(), p2, p3.id(), p3)
        );

        Optional<Person> optionalPerson = myPersons.getPerson(p2);
        if (optionalPerson.isPresent()) {
            System.out.println("My name is: " + optionalPerson.get().name());
            System.out.println("I like: " + optionalPerson.get().favoriteDay());
        }

        System.out.println("Männer: " + myPersons.countByGender(Gender.MALE));
        System.out.println("Frauen: " + myPersons.countByGender(Gender.FEMALE));
        System.out.println("Divers: " + myPersons.countByGender(Gender.DIVERSE));
    }
}
