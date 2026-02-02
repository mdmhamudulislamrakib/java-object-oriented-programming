package overloading;

public class NewClass {

    public void function1(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    // public void function1(int x,int y,int z){
    public void function1(int a, int b, int z) {
        int w = a + b + z;

        System.out.println(w);
    }

}
