import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int Tpar = 0, Tpos = 0, Tneg = 0;

        for (int i = 0; i < 5; i++) {
            int aux = sc.nextInt();
            if (aux % 2 == 0) Tpar++;
            if (aux > 0)      Tpos++;
            if (aux < 0)      Tneg++;
        }

        System.out.printf("%d valor(es) par(es)%n", Tpar);
        System.out.printf("%d valor(es) impar(es)%n", 5 - Tpar);
        System.out.printf("%d valor(es) positivo(s)%n", Tpos);
        System.out.printf("%d valor(es) negativo(s)%n", Tneg);

        sc.close();
    }
}