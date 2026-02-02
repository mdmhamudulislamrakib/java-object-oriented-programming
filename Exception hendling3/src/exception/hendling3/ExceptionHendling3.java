package exception.hendling3;

public class ExceptionHendling3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0, j = 5, k = 0;

        int ar[] = new int[5];

        try {
            ar[10] = 10;
            } 
        catch (ArithmeticException e) {
            System.out.println("this is arithmetic exception");
        } 
        
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exceeded array size"); 
        }
        
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("value of k: " + k);

    }

}
