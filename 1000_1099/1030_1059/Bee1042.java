import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int[] original = new int[3];
        original[0] = leitor.nextInt();
        original[1] = leitor.nextInt();
        original[2] = leitor.nextInt();

        // Cópia para ordenar
        int[] ordenado = original.clone();
        Arrays.sort(ordenado);

        // Imprime na ordem crescente
        for (int n : ordenado) {
            System.out.println(n);
        }

        // Linha em branco entre os dois blocos
        System.out.println();

        // Imprime na ordem de entrada
        for (int n : original) {
            System.out.println(n);
        }

        leitor.close();
    }
}