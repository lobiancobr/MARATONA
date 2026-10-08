import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner input = new Scanner(System.in);
        double A, B, C, D, delta;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
    
        delta=B*B-4*A*C;
        D = Math.sqrt(delta);
        if (delta < 0 || A == 0)
            System.out.println("Impossivel calcular");
        else
        {
            System.out.printf("R1 = %.5f\n", (-B + D)/(2*A));
            System.out.printf("R2 = %.5f\n", (-B - D)/(2*A));
        }
    }
}