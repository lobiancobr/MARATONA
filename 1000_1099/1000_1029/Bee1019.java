import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N, horas, minutos, segundos;

        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        segundos = N % 60;
        minutos = (N % 3600) / 60;
        horas = N / 3600;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}