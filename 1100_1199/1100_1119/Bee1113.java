import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X == Y) {
                break;
            }

            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }

        sc.close();
    }
}