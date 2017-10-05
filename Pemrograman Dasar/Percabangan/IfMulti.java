import java.util.Scanner;

public class IfMulti {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println(a);
            }

        }
    }
}
