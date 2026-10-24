import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        
        int total = input.nextInt();

        int anos = total / 365;
        int meses = total % 365;
        int dias = meses % 30;

        meses = meses / 30;

        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);

    }
 
}