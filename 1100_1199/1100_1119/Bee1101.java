import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            if (M <= 0 || N <= 0) {
                break;
            }

            int menor = Math.min(M, N);
            int maior = Math.max(M, N);

            int soma = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = menor; i <= maior; i++) {
                sb.append(i).append(' ');
                soma += i;
            }

            System.out.println(sb + "Sum=" + soma);
        }

        sc.close();
    }
}