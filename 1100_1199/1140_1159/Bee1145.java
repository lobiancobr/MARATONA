import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 1; i <= Y; i++) {
            if (i % X == 0 || i == Y) {
                System.out.println(i);   // último da linha ou último número geral
            } else {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}