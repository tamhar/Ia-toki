import java.util.Scanner;

public class IfThenElse {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();

        if (a > 0) {
            System.out.println("positif");
        } else if (a < 0) {
            System.out.println("negatif");
        } else {
            System.out.println("nol");
        }
    }
}
