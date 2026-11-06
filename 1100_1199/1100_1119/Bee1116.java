import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (Y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f%n", (double) X / Y);
            }
        }

        sc.close();
    }
}