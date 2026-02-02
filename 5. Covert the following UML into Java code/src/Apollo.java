class SpaceCarft {

    protected String model;

    public SpaceCarft(String model) {
        this.model = model;
    }

    public void display() {
        System.out.println("THIS SPACE CRAFT MODEL: " + model);
    }
}

interface Drive {

    public void drive();

    public void stop();

    public void turn();
}

interface Shuttle {

    public void startshuttle();

    public void stopshuttle();
}

public class Apollo extends SpaceCarft implements Drive, Shuttle {

    private int gear;

    public Apollo(int gear, String model) {
        super(model);
        this.gear = gear;
    }

    public void drive() {
        System.out.println("this space craft can be driven");
    }

    public void stop() {
        System.out.println(" CAR CAN STOP");
    }

    public void turn() {
        System.out.println(" CAR CAN TURN");
    }

    public void startshuttle() {
        System.out.println(" CAR start shuttle");
    }

    @Override
    public void stopshuttle() {
        System.out.println(" CAR stop shuttle");
    }

    public static void main(String[] args) {
        Apollo apollo = new Apollo(4, "Apollo 1004");

        apollo.display();
        apollo.drive();
        apollo.stop();
        apollo.turn();
        apollo.startshuttle();
        apollo.stopshuttle();
    }
}

