import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int alc = 0, gas = 0, die = 0, N;

        do {
            N = sc.nextInt();
            switch (N) {
                case 1: alc++; break;
                case 2: gas++; break;
                case 3: die++; break;
                // 4 → sai do loop; outros → ignora
            }
        } while (N != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alc);
        System.out.printf("Gasolina: %d%n", gas);
        System.out.printf("Diesel: %d%n", die);

        sc.close();
    }
}