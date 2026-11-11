import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        int opcao = 1;

        while (opcao != 2) {
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = sc.nextInt();
        }

        int total = vitoriasInter + vitoriasGremio + empates;

        System.out.printf("%d grenais%n", total);
        System.out.printf("Inter:%d%n", vitoriasInter);
        System.out.printf("Gremio:%d%n", vitoriasGremio);
        System.out.printf("Empates:%d%n", empates);

        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        sc.close();
    }
}