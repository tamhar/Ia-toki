import java.util.Scanner;

public class FloorCeil {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a = keyboard.nextDouble();
        long rounded = Math.round(a);
        if (a == rounded) {
            System.out.println(rounded + " " + rounded);
        } else if (a > rounded) {
            System.out.println(rounded + " " + (rounded + 1));
        } else {
            System.out.println((rounded - 1) + " " + rounded);
        }
    }
}
