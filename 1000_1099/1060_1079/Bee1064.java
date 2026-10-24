import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        double total = 0.0;

        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n > 0) {
                positivos++;
                total += n;
            }
        }

        System.out.printf("%d valores positivos%n", positivos);
        if (positivos > 0) {
            System.out.printf("%.1f%n", total / positivos);
        }

        sc.close();
    }
}