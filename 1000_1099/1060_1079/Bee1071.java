import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int maior, menor; 
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int contador, resultado=0;
        
        if (x>y){
            maior=x;
            menor=y;
        }else{
            menor=x;
            maior=y;
        }
  
       for (contador=maior-1; contador>menor; contador--) 
       {
            if (contador%2 != 0)
                resultado = contador + resultado;   
        }
    
        // se os dois numeros forem iguais, o resultado é zero.
        System.out.printf("%d\n", resultado );
    }
}