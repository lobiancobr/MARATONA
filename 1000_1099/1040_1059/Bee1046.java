import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int horaInicio = entrada.nextInt();
        int horaFim = entrada.nextInt();

        // Fórmula modular: resolve todos os casos de uma vez
        int duracao = (horaFim - horaInicio + 24) % 24;
        if (duracao == 0) duracao = 24;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        entrada.close();
    }
}