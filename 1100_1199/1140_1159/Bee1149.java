import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int N;

        do {
            N = sc.nextInt();
        } while (N <= 0);

        // Soma de N termos a partir de A: S = N * (2A + N - 1) / 2
        int soma = N * (2 * A + N - 1) / 2;

        System.out.println(soma);

        sc.close();
    }
}