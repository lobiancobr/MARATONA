import java.io.IOException;
import java.util.Scanner;
 
public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Verificando se os valores formam um triângulo
        if ((a + b) > c && (a + c) > b && (b + c) > a){
            // Calculando o perímetro do triângulo
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n" , perimetro);
        }
        else{
            // Calculando a área do trapézio
            double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n" , area);          
        }
    }
}