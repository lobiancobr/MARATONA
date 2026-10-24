import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int Mab = (A+B+Math.abs(A-B))/2;
        int Mabc = (Mab+C+Math.abs(Mab-C))/2;
 
        System.out.printf("%d eh o maior\n",Mabc);
    }
 
}