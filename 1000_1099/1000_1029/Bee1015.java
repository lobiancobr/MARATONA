import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double x1, y1, x2, y2, distancia;

        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        distancia = Math.pow((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) , 0.5);

        System.out.printf("%.4f\n", distancia);
    }
}