import java.util.Scanner;

public class IfCase {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();

        if (a < 10) {
            System.out.println("satuan");
        } else if (a < 100) {
            System.out.println("puluhan");
        } else if (a < 1000) {
            System.out.println("ratusan");
        } else if (a < 10000) {
            System.out.println("ribuan");
        } else {
            System.out.println("puluhribuan");
        }
    }
}
