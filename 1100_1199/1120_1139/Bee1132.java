import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);

        int total = 0;
        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0) {
                total += i;
            }
        }

        System.out.println(total);

        sc.close();
    }
}