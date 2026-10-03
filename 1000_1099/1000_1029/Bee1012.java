import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        
        double R = A*C/2;
        System.out.printf("TRIANGULO: %.3f\n",R);
        R = 3.14159*C*C;
        System.out.printf("CIRCULO: %.3f\n",R);
        R = C*(A+B)/2;
        System.out.printf("TRAPEZIO: %.3f\n",R);
        R = B*B;
        System.out.printf("QUADRADO: %.3f\n",R);
        R = A*B;
        System.out.printf("RETANGULO: %.3f\n",R);
 
    }
 
}