import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitura = new Scanner(System.in);
        int cod1 = leitura.nextInt();
        int n1 = leitura.nextInt();
        double p1 = leitura.nextDouble();
        int cod2 = leitura.nextInt();
        int n2 = leitura.nextInt();
        double p2 = leitura.nextDouble(); 
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",n1*p1+n2*p2);
    }
 
}