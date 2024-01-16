public class State {
    private int id;
    private String name;
    private Country country1;

    public State(int id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country1 = country;
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country1=" + country1 +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry1() {
        return country1;
    }

    public void setCountry1(Country country1) {
        this.country1 = country1;
    }
}
