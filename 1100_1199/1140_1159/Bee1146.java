import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            int N = Integer.parseInt(input);

            if (N == 0) {
                break; // Encerra o programa se o valor for 0
            }

            StringBuilder output = new StringBuilder();

            for (int i = 1; i <= N; i++) {
                output.append(i);
                if (i < N) {
                    output.append(" "); // Adiciona espaço entre os números
                }
            }

            System.out.println(output.toString()); // Imprime a sequência
        }
    }
}
