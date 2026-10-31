import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        for (int k = 0; k <= 10; k++) {
            double i = k * 0.2;

            for (int m = 1; m <= 3; m++) {
                double j = i + m;

                boolean iInteiro = (i == Math.floor(i));
                boolean jInteiro = (j == Math.floor(j));

                if (iInteiro && jInteiro)
                    System.out.printf("I=%.0f J=%.0f%n", i, j);
                else if (iInteiro)
                    System.out.printf("I=%.0f J=%.1f%n", i, j);
                else if (jInteiro)
                    System.out.printf("I=%.1f J=%.0f%n", i, j);
                else
                    System.out.printf("I=%.1f J=%.1f%n", i, j);
            }
        }
    }
}