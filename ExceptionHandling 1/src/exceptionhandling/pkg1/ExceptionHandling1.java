package exceptionhandling.pkg1;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0, j = 5, k = 0;
        
        try {
            k = j / i;
        }
        catch (ArithmeticException e) {
           System.out.println("this is arithmetic exception");
          
       
        } catch (Exception e) {
            System.out.println("this is just a normal exception"); 
        }

        System.out.println("value of k: " + k);
    }

}
