import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dentro = 0;

        for (int i = 0; i < N; i++) {
            int numero = sc.nextInt();
            if (numero >= 10 && numero <= 20) {
                dentro++;
            }
        }

        System.out.printf("%d in%n", dentro);
        System.out.printf("%d out%n", N - dentro);

        sc.close();
    }
}