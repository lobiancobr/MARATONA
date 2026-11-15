import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Z;

        do {
            Z = sc.nextInt();
        } while (Z <= X);

        int soma = 0;
        int contador = 0;

        while (soma <= Z) {
            soma += X + contador;
            contador++;
        }

        System.out.println(contador);

        sc.close();
    }
}