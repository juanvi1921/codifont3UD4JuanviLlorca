import java.util.ArrayList;

public class Address {
    private String street;
    private String city;
    private int cp;
    private ArrayList<Person> person;
    private State state1;

    public Address(String street, String city, int cp, ArrayList<Person> person, State state) {
        this.street = street;
        this.city = city;
        this.cp = cp;
        this.person = person;
        this.state1 = state;
    }

    public Address(String street, String city, int cp, State state1) {
        this.street = street;
        this.city = city;
        this.cp = cp;
        this.state1 = state1;
        this.person = new ArrayList<Person>(0);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", cp=" + cp +
                ", person=" + person +
                ", state1=" + state1 +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public State getState1() {
        return state1;
    }

    public void setState1(State state1) {
        this.state1 = state1;
    }
}
