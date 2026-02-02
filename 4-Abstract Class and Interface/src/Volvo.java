
class Vehicle {

    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public void display() {
        System.out.println("Model is : " + model);
    }
}

interface Drive {

    public void startEngine();

    public void stopEngine();
}

public class Volvo extends Vehicle implements Drive {

    private double price;

    public Volvo(double price) {
        super("BMW 200");
    }

    @Override
    public void startEngine() {
        System.out.println("START ENGINE ");
    }

    @Override
    public void stopEngine() {
        System.out.println("STOP ENGINE");
    }

    public static void main(String[] args) {
        Volvo obj = new Volvo(454.3);
        obj.startEngine();
        obj.stopEngine();
        obj.display();
        System.out.println("PRICE IS: " + obj.price);

    }
}
