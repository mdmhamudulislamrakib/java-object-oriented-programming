package exception.handling 1;

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("print 2");
        int i = 0, k = 324, j = 9;
         //324/0
        try {
            j = k / i;
        } catch (Exception e) {
            System.out.println("here i am");
        }
        System.out.println("print 1");
    }

}
