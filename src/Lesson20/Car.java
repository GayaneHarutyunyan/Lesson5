package Lesson20;


import Lesson8.hierarchy.Person;

import java.io.Serializable;

/**
 * Created by User on 19.04.2016.
 */
public class Car implements Serializable {
    private final String brand;
    private final int year;
    private final Person owner;

    private transient Rentor rentor;

    public Car(String brand, int year, Person owner) {
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                ", rentor=" + rentor +
                '}';
    }
}