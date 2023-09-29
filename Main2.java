import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        int d = scanner.nextInt();

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }

        System.out.println("Найменше число: " + min);
    }
}