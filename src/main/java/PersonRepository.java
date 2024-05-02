import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    private Map<String, Person> persons = new HashMap<>();

    public PersonRepository() {
    }

    public PersonRepository(Map<String, Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person newPerson) {
        persons.put(newPerson.id(), newPerson);
    }

    public Optional<Person> getPerson(Person person) {
        return Optional.ofNullable(persons.get(person.id()));
    }

    public int countByGender(Gender gender) {
        int counter = 0;
        for (Person p : persons.values()) {
            if (p.gender() == gender) {
                counter++;
            }
        }
        return counter;
    }

    public Map<String, Person> getPersons() {
        return persons;
    }
}
