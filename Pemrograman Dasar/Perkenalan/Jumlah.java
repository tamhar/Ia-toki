import java.util.Scanner;

public class Jumlah {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        System.out.println(a + b);

        keyboard.close();
    }
}
