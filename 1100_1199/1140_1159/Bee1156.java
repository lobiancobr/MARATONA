import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        double S = 1.0;
        int den = 2;

        for (int i = 3; i <= 39; i += 2, den *= 2) {
            S += (double) i / den;
        }

        System.out.printf("%.2f%n", S);
    }
}