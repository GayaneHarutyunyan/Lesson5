package Lesson31;

import java.util.Optional;

/**
 * Created by User on 10.06.2016.
 */
public class Flat {
    Optional<Citizen> citizen = Optional.empty();

    public Optional<Citizen> getCitizen() {
        return citizen;
    }
}