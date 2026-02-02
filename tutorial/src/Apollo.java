
public class Apollo extends SpaceCarft implements Drive, Shuttle {

    private int gear;

    public Apollo(int gear, String model) {
        super(model);
        this.gear = gear;

    }

    public static void main(String[] args) {
        Apollo apollo = new Apollo(4, "Apollo1004");

        apollo.display();
        apollo.drive();
        apollo.stop();
        apollo.turn();
        apollo.startshuttle();
        apollo.stopshuttle();
    }

    public void drive() {
        System.out.println("this space craft can be driven");
    }

    public void stop() {
        System.out.println("stop car");
    }

    public void turn() {
        System.out.println("car turn");

    }

    public void startshuttle() {
        System.out.println(" startshuttle");

    }

    public void stopshuttle() {
        System.out.println("stopshuttle");

    }
}
