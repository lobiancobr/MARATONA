import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double soma = 0.0;
        int count = 0;

        while (true) {
            int N = sc.nextInt();

            if (N < 0) {
                break;
            }

            soma += N;
            count++;
        }

        if (count > 0) {
            System.out.printf("%.2f%n", soma / count);
        }

        sc.close();
    }
}