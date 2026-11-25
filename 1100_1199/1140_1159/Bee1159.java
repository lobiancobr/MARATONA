import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();

            if (N == 0) {
                break;
            }

            if (N % 2 != 0) {
                N++;
            }

            int soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += N;
                N += 2;
            }

            System.out.println(soma);
        }

        sc.close();
    }
}