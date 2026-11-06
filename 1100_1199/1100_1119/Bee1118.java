import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double soma = 0.0;
            int validas = 0;

            // Lê as duas notas válidas
            while (validas < 2) {
                double nota = sc.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    soma += nota;
                    validas++;
                } else {
                    System.out.println("nota invalida");
                }
            }

            System.out.printf("media = %.2f%n", soma / 2.0);

            // Loop para validar a escolha
            int escolha;
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                escolha = sc.nextInt();
            } while (escolha != 1 && escolha != 2);

            if (escolha == 2) {
                break;
            }
        }

        sc.close();
    }
}