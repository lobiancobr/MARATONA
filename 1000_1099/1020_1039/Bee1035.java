import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in); 
    int A = input.nextInt();
    int B = input.nextInt();
    int C = input.nextInt();
    int D = input.nextInt();
    int aceito=0;

    int somaAB=A+B;
    int somaCD=C+D;
    
    //se B for maior do que C
    if(B > C) 
    //se D for maior do que A
    if(D > A) 
    //soma de C com D for maior que a soma de A e B
    if(somaCD > somaAB)
    //se C e D, ambos, forem positivos
    if(C>0 && D>0)
    //se a variável A for par
    if(A%2==0)
        aceito=1;
        
    if(aceito==1)
        System.out.printf("Valores aceitos\n");
    else
        System.out.printf("Valores nao aceitos\n");
    }
 
}
