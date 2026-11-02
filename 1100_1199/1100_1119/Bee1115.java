import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X == 0 || Y == 0) {
                break;
            }

            if (X > 0) {
                if (Y > 0) {
                    System.out.println("primeiro");
                } else {
                    System.out.println("quarto");
                }
            } else {
                if (Y > 0) {
                    System.out.println("segundo");
                } else {
                    System.out.println("terceiro");
                }
            }
        }

        sc.close();
    }
}