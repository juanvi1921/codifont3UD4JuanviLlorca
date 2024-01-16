public class Main {

    public static void main(String[] args) {
        AddressBook addressBook1 = new AddressBook(5875);
        Country country1 = new Country(5454, "Espanya");
        State state1 = new State(5555, "La Vila", country1);
        Address address1 = new Address("Quintana", "La Vila", 03570, state1);
        Person person1 = new Person("Juan", 676458589, "jualolo@gmail.com", addressBook1, address1);

        System.out.println(person1);
    }
}
