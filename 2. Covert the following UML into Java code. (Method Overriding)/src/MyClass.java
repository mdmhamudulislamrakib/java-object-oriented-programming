
class Human {

    protected String name;
    protected int age;

    public void move() {

        System.out.println("Human can move.");

    }

    public void eat() {

        System.out.println("Human can eat.");

    }

}

class Boy extends Human {

    public Boy(String name, int age) {
        super();
        super.move();
        super.eat();
        System.out.println("\nIn Boy : RAKIB");

    }

    public void play() {
        System.out.println("RAKIB can play.");

    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("RAKIB can eat.");

    }

}

class Girl extends Human {

    public Girl(String name, int age) {
        super();
        System.out.println("\nIn Girl :BORSHA");

    }

    public void cook() {

        System.out.println("BORSHA can cook.");

    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("BORSHA can eat.");

    }

}

public class MyClass {  //instead of MyClass

    public void display() {

        System.out.println("In Human : ");

    }

    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.display();

        Boy b = new Boy("RAKIB", 23);
        b.play();
        b.eat();
        Girl g = new Girl("BORSHA", 23);
        g.cook();
        g.eat();
    }
}
