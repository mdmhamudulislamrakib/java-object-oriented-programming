package inheritance;

public class Father {
    //father super class
    public int a=10;
    public int b=20;
    public int c;
    
    public void function1(){
        this.c=this.a+this.b;
        System.out.println(this.c);
    }
}
