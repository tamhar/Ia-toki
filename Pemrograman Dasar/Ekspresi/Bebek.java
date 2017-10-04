import java.util.Scanner;

public class Bebek {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        int bagi = a / b;
        int sisa = a % b;
        System.out.println("masing-masing " + bagi);
        System.out.println("bersisa " + sisa);
    }
}
