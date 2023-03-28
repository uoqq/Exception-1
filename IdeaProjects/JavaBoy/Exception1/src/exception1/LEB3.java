package exception1;

public class LEB3 {
    public static void main(String[] args) {

        int[] list = new int[10];
        try {
            System.out.println("statement 1");
            System.out.println(list[10]);
            System.out.println("statement 3");
        } catch (Exception e) {
        } finally {
            System.out.println("Statement 4");
        }
        System.out.println("statement 5");
    }
}

