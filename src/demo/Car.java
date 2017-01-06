package demo;

/**
 * Created by Manohar on 12/20/2016.
 */
public class Car {
    final static String COMPANY = "Toyota";
    private String color;
    private int makeYear;
    private String model;
    private short maxSpeed;
    private int speed = 0;


    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void accelerate() {
        int x;
        if (speed >= maxSpeed) {
            System.out.println("Reach max speed");
            return;
        }
        speed = speed + 50;
    }

    public static void displayCompany() {
        System.out.print(COMPANY);
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "Red";
        car1.makeYear = 2017;
        car1.model = "Camry";
        car1.maxSpeed = 200;

        System.out.println(car1.getMakeYear());
        Car.displayCompany();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();

//        Car car2 = new Car();
//        car1.color = "Yellow";
//        car1.makeYear = 2018;
//        car1.model = "Rav4";
    }
}
