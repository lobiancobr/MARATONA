import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int horas = input.nextInt();
        int velocidade = input.nextInt();

        System.out.printf("%.3f\n",horas*velocidade/12.);
 
    }
 
}