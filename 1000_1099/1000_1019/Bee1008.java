import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {

        int num, horas;
        double valor;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        horas = input.nextInt();
        valor = input.nextDouble();
        
        System.out.printf("NUMBER = %d\n", num);
        System.out.printf("SALARY = U$ %.2f\n", horas*valor);
    }
 
}