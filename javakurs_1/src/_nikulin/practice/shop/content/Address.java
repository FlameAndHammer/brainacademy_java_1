package _nikulin.practice.shop.content;

/**
 * Created by Александр on 05.09.2016.
 */
public class Address {
    private String city;
    private int index;
    private String street;
    private int houseNumber;

    public Address(int index, String city, String street, int houseNumber) {
        this(city, street, houseNumber);
        this.index = index;
    }

    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
