package Lesson10Patterns.fly;

/**
 * Created by User on 18.03.2016.
 */
public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}