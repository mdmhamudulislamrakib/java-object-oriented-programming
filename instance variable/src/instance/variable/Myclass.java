
package instance.variable;

public class Myclass {
    public int a = 10;
    public int b = 5;
    public int c;
    
    public void function1(){
        this.c=this.a;
        this.c=this.b;
        this.c=this.a+b;
        System.out.println(this.c);
    }
    
}
