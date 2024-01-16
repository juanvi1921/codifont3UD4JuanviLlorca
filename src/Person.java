public class Person {
    private String name;
    private int phoneNumber;
    private String email;
    private AddressBook propietario;
    private Address livesAt;

    public Person(String name, int phoneNumber, String email, AddressBook propietario, Address livesAt) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.propietario = propietario;
        this.livesAt = livesAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", propietario=" + propietario +
                ", livesAt=" + livesAt +
                '}';
    }

    public AddressBook getPropietario() {
        return propietario;
    }

    public void setPropietario(AddressBook propietario) {
        this.propietario = propietario;
    }

    public Address getLivesAt() {
        return livesAt;
    }

    public void setLivesAt(Address livesAt) {
        this.livesAt = livesAt;
    }

    // todo
    private static void purchaseParkingPass() {

    }
}
