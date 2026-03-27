public class Family {

    private Map<String, Lista<Person>> people = new HashMap<>();
    public void add(Person... person){
        for (Person person : people){
//            this.people.put(person.name(), person);
            String.key = person.name();
            if(this.people.containsKey(key)){
                List<Person> temp = this.people.get(key);
                temp.add
            }
        }
    }

    public  Person get(String key){
        return people.get(key);
    }
}
