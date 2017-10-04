import java.util.Scanner;

public class Segitiga {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        double luas = a * b / 2.0;

        System.out.printf("%.2f", luas);
        System.out.println();
    }
}
