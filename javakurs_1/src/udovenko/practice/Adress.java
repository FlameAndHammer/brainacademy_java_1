package udovenko.practice;

import java.text.Format;

/**
 * Created by gladi on 05.09.2016.
 */
class Adress {
    private int index;
    private String city;
    private String street;
    private int home;

    Adress(int index, String city, String street, int home) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.home = home;
    }

    void setIndex(int index) {
        this.index = index;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString(){
        return String.format("%d %s, %, %d", home, street, city, index);
    }
}
