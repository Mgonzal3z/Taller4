package co.edu.unbosque.jdbc.dtos;

public class Owner {

    private String username;
    private String personId;
    private String name;
    private String address;
    private String neighborhood;

    public Owner(String username, String personId, String name, String address, String neighborhood ) {
        this.address = address;
        this.name = name;
        this.username = username;
        this.personId = personId;
        this.neighborhood = neighborhood;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}
