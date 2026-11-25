import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int k = 0; k < N; k++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X % 2 == 0) {
                X++;
            }

            int soma = 0;
            for (int i = 0; i < Y; i++) {
                soma += X;
                X += 2;
            }

            System.out.println(soma);
        }

        sc.close();
    }
}