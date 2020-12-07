import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Person {
    int age;
    String name;
    LocalDate birthday;
    LocalDate deathDay;
    ArrayList<Relationship> relationships;

    public Person(String name, LocalDate birthday, LocalDate deathDay) {
        this.name = name;
        this.birthday = birthday;
        this.deathDay = deathDay;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        if(deathDay == null) {
            return Period.between(birthday, currentDate).getYears();
        }
        return Period.between(birthday, deathDay).getYears();
    }
    public void addNewRelationship(String name, LocalDate birthday, LocalDate deathDay, String relationshipType) {
        Person newRelative = new Person(name, birthday, deathDay);
        Relationship addRelationship = new Relationship(newRelative, relationshipType);
        relationships.add(addRelationship);
    }
}
