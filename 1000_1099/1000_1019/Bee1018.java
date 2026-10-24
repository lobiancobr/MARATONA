import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        int n100 = total / 100;
        int n50 = (total % 100) / 50;
        int n20 = (total % 50) / 20;
        int n10 = ((total % 50)%20) / 10;
        int n5 = (total % 10) / 5;
        int n2 = (total % 5) / 2;
        int n1 = ((total % 5)%2);
    
        System.out.printf("%d\n",total);
        System.out.printf("%d nota(s) de R$ 100,00\n",n100);
        System.out.printf("%d nota(s) de R$ 50,00\n",n50);
        System.out.printf("%d nota(s) de R$ 20,00\n",n20);
        System.out.printf("%d nota(s) de R$ 10,00\n",n10);
        System.out.printf("%d nota(s) de R$ 5,00\n",n5);
        System.out.printf("%d nota(s) de R$ 2,00\n",n2);
        System.out.printf("%d nota(s) de R$ 1,00\n",n1);
    }
}