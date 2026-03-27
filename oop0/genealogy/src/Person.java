import java.util.Iterator;
import java.util.NoSuchElementException;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;

    private Set<Person> children = new HashSet<>();

    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public boolean adopt(Person child){
        if(child == this) return false;
        return  children.add(child);
    }


    public Person getYoungerChild(){
        Iterator<Person> iter = this.children.iterator();
        Person new = iter.next();
        Person youngest = now;

        while(true){
            if(youngest.birthday.compareTo(now.birthday) < 0){
                youngest = now;
            }
            try{ iter.next();
            } catch (NoSuchElementException e){
                break;
            }
        }
        return youngest;
    }


    @Override
    public String toString(){
        return  "Person{" +
        " firstName='"+ firstName + '\'' +
        " lastName='"+ lastName + '\'' +
        " birthday=" + birthday +
                "children= "+ children +
                '}';
    }
}
