import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        int h1 = leitor.nextInt();
        int m1 = leitor.nextInt();
        int h2 = leitor.nextInt();
        int m2 = leitor.nextInt();

        // transforma em minutos
        int t1 = h1*60 + m1;
        int t2 = h2*60 + m2;
        // imprime a diferenca
        if(t1<t2)
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",
                (t2-t1)/60,(t2-t1)%60);
        else
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",
                (24*60 + t2-t1)/60,(24*60 + t2-t1)%60); 
    }
 
}