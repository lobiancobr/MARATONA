import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int validas = 0;
        double soma = 0.0;

        while (validas < 2) {
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                soma += nota;
                validas++;
            }
        }

        System.out.printf("media = %.2f%n", soma / 2.0);

        sc.close();
    }
}