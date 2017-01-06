package inh;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

/**
 * Created by Manohar on 12/22/2016.
 */
class Shape {
    int type;
    String color;

    float calculateArea() {
        System.out.println("I can't calculate");
        return 0f;
    }


    public Shape(int type, String color) {
        System.out.println("Shape constructor executed");
        this.type = type;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Type : " + type);
        System.out.println("Color : " + color);
    }

    public static void displayStaticInfo() {
        System.out.println("I ma from shape displayStaticInfo");
    }
}

class Rectangle extends Shape {
    int length, width;

    public Rectangle(int type, String color) {
        super(type, color);
        System.out.println("Rectangle constructor executed");
    }

    public Rectangle(int type, String color, int length, int width) {
        super(type, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public float calculateArea() {
        return length * width;
    }

    public void flip() {
        super.calculateArea();
        System.out.println("Rectangle got flipped");
    }


//    public static void displayStaticInfo() {
//        System.out.println("I ma from rectangle displayStaticInfo");
//    }
}

class Circle extends Shape {

    float radious;

    @Override
    public float calculateArea() {
        return 3.14f * radious * radious;
    }

    public float calculateArea(int r) {
        return 3.14f * r * r;
    }


    public float calculateArea(float r) {
        return 3.14f * r * r;
    }

    public Circle(int type, String color) {
        super(type, color);
        System.out.println("Circle constructor executed");
    }

    public Circle(int type, String color, float radious) {
        super(type, color);
        this.radious = radious;
    }

    public void fillColor() {
        System.out.println("Filling circle with color " + color);
    }
}

public class InhDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, "Red");
        rectangle.flip();
        rectangle.displayInfo();

        Rectangle rectangle2 = new Rectangle(2, "Yellow", 5, 10);
        rectangle2.flip();
        rectangle2.displayInfo();
        System.out.println("Rectangle are is : " + rectangle2.calculateArea());


        Circle circle = new Circle(2, "Yellow", 5);
        circle.displayInfo();
        System.out.println("Circle area is : " + circle.calculateArea());
        System.out.println("Circle area is : " + circle.calculateArea(5));
        System.out.println("Circle area is : " + circle.calculateArea(5f));


        Shape shape = new Shape(1 , "Yellow");

        System.out.println("Which shape you like, 1. Circle, 2. Rect");
        int option = new Scanner(System.in).nextInt();

        switch(option) {
            case 1:
                shape = new Circle(3, "Red", 2);
                break;
            case 2:
                shape = new Rectangle(4, "Brown", 5, 7);
                break;
            default:
                System.out.println("Invalid option, try again later");
                break;
        }
        shape.displayInfo();
        System.out.println("Area of the selected shape is : " + shape.calculateArea());
        Rectangle.displayStaticInfo();
    }
}