
class CDPlayer {

    private String name;

    public CDPlayer(String name) {
        this.name = name;

        // public void audio();
    }
}

class DVDPlayer {

    private DVDPlayer(String name) {;
    }
}

interface Player {

    public void play();

    public void stop();

    public void pause();

    public void reverse();
}

public class MyClass extends DVDPlayer implements Player {

    public int name;

    public MyClass(int name) {

    }

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    public void pause() {
        System.out.println("pause");
    }

    public void reverse() {
        System.out.println("reverse");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(rakib);
        obj.play();
        obj.stop();
        obj.pause();

        System.out.println("NAME IS" + obj.name);
    }
}
