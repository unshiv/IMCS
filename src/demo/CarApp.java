package demo;

/**
 * Created by Manohar on 12/20/2016.
 */
public class CarApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMakeYear(2017);
        System.out.println(car.getMakeYear());


        Car car2 = new Car();
        car2.setMakeYear(2016);
        System.out.println(car2.getMakeYear());
    }
}
