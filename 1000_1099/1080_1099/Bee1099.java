import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int menor = Math.min(X, Y);
            int maior = Math.max(X, Y);

            int soma = 0;
            for (int j = menor + 1; j < maior; j++) {
                if (j % 2 != 0) {   // ✅ ímpar (funciona para negativos)
                    soma += j;
                }
            }
            System.out.println(soma);
        }

        sc.close();
    }
}