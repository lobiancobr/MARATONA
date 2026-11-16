import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int anterior = 0;
        int atual = 1;

        for (int i = 1; i <= N; i++) {
            if (i == N) {
                System.out.print(anterior);
            } else {
                System.out.print(anterior + " ");
            }

            // Próximo termo sem variável auxiliar
            int temp = anterior + atual;
            anterior = atual;
            atual = temp;
        }

        System.out.println();
        sc.close();
    }
}