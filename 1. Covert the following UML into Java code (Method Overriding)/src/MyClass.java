
//1. Covert the following UML into Java code (Method Overriding

class Vehicle {

    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void show() {
        System.out.println("\n  IN VEHICLE :- ");
    }

    public void move() {
        System.out.println("VEHICLE CAN MOVE.");
    }

    public void carry() {
        System.out.println("VEHICLE CAN  CARRY OBJECT.");
    }
}

class Car extends Vehicle {

    private String material;

    public Car(String material, int speed) {
        super(speed);//calling super class .this is parameterized constructor
        super.show();
        super.move();
        super.carry();

        this.material = material;
        System.out.println("\n  IN CAR :- ");
    }

    public void stop() {
        System.out.println("CAR CAN BREAK.");
    }

    @Override
    public void move() {
        //super.move();
        System.out.println("CAR CAN MOVE.");
    }
}

class Boat extends Vehicle {

    private String material;

    public Boat(String material, int speed) {

        super(speed);//CALLING SUPER CLASS PARAMETERIZED CONSTROCTOR.
        this.material = material;
        System.out.println("\n  IN BOAT :- ");
    }

    public void slowSpeed() {
        System.out.println("BOART CAN SLOW SPEED.");
    }

    @Override
    public void move() {
        //super.move();
        System.out.println("BOART CAN MOVE.");
    }
}

public class MyClass {//MAIN CLASS

    public void display() {
        System.out.println("DISPLAYING  THE ALL THINGS :");
    }

    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.display();
        Car c = new Car("parts", 10);
        c.move();
        c.stop();
        Boat b = new Boat("elements", 10);
        b.move();
        b.slowSpeed();

    }
}
