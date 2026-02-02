
import java.util.Scanner;

public class myclassSCANNER {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        
        System.out.print("input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input the second number: ");
        int num2 = in.nextInt();

        System.out.print("input the third number: ");
        int num3 = in.nextInt();
       
        System.out.println(num1 + " x " + num2 + " x " + num3 + " = " + num1 * num2 *num3);

    }

}
