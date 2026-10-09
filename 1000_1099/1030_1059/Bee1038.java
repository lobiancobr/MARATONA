import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    int codigo, quantidade;
    double total = 0;

    Scanner input = new Scanner(System.in);
    codigo = input.nextInt();
    quantidade = input.nextInt();
    
    switch (codigo)
    {
        case 1: total=4.0*quantidade ; break;
        case 2: total=4.5*quantidade ; break;
        case 3: total=5.0*quantidade ; break;
        case 4: total=2.0*quantidade ; break;
        case 5: total=1.5*quantidade ; break;
    }
    
    System.out.printf("Total: R$ %.2f\n", total);
    
  }
}
