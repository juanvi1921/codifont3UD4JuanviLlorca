import java.util.ArrayList;

public class AddressBook {
    private int code;
    private ArrayList <Person> persons;

    public AddressBook(int code, ArrayList<Person> persons) {
        this.code = code;
        this.persons = persons;
    }

    public AddressBook(int code) {
        this.code = code;
        this.persons = new ArrayList<Person>(0);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "code=" + code +
                ", persons=" + persons +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
}
