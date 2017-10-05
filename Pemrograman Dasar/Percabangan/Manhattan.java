import java.util.Scanner;

public class Manhattan {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int x1 = keyboard.nextInt();
        int y1 = keyboard.nextInt();
        int x2 = keyboard.nextInt();
        int y2 = keyboard.nextInt();
        int x, y;

        if (x1 > x2) {
            x = x1 - x2;
        } else {
            x = x2 - x1;
        }
        if (y1 > y2) {
            y = y1 - y2;
        } else {
            y = y2 - y1;
        }
        System.out.println(x + y);
    }
}
