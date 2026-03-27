import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Person> people = new ArrayList<>();

        people.add(new Person(
                "Mike",
                "Tyson",
                LocalDate.of(1966, 5, 18)
        ));
        people.add(new Person(
                "Anna",
                "Nowak",
                LocalDate.of(2002, 4, 10)
        ));
        people.add(new Person(
                "Muhammad",
                "Ali",
                LocalDate.of(1944, 1, 2)
        ));



        Person parent = people.get(0);
        Person child = people.get(1);

        System.out.println(parent.adopt(child));
        System.out.println(parent.adopt(child));
        System.out.println(parent.adopt(parent));
        Perent.adopt(people.get(2));
//        System.out.println(people);
        System.out.println(parent.getYoungerChild());
        System.out.println(perent.getChildren());
        Family family = new Family();
//        for(Person person : people){
//            family.add(person);
//        }

        family.add(people.get(0));
        family.add(people.get(1), people.get(2));


        Person mike = family.get("Mike Tyson");
        System.out.println(mike);
    }
}