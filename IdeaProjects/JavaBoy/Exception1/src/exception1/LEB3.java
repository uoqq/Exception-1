package exception1;

public class LEB3 {
    public static void main(String[] args) {

        int[] list = new int[10];
        try
        {
            System.out.println("statement 1");
            System.out.println(1/0);
            System.out.println("statement 3");
        }
        catch (ArithmeticException e)
        {

        }
        finally
        {
            System.out.println("Statement 4");
        }
        System.out.println("statement 5");
    }
}

