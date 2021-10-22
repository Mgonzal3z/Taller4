package co.edu.unbosque.jdbc.dtos;

public class Pet {

    private Integer petId;
    private String microchip;
    private String name;
    private String species;
    private String race;
    private String size;
    private String sex;
    private String picture;
    private String ownerId;

    public Pet(Integer petId,String microchip, String name, String species,String race, String size, String  sex, String picture, String ownerId) {
        this.petId = petId;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.ownerId = ownerId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getMicrochip() {
        return microchip;
    }

    public String getRace() {
        return race;
    }

    public String getSize() {
        return size;
    }

    public String getSex() {
        return sex;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPicture() {
        return picture;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
