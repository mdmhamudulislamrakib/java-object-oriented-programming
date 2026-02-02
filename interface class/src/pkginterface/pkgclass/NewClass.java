
package pkginterface.pkgclass;

interface First {

    void Firstmethod();
}

interface Second {

    void Secondmethod();
}

interface Third {

    void Thirdmethod();
}

public class NewClass implements First, Second, Third {// implement

//public class NewClass {// if i not implement that is work aslso

    public void Firstmethod() {
        System.out.println("First interface");
    }

    public void Secondmethod() {
        System.out.println("Second interface");
    }

    public void Thirdmethod() {
        System.out.println("Third interface");
    }

}
