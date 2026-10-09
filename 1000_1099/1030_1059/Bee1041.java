import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double x = leitor.nextDouble();
        double y = leitor.nextDouble();
    
        if (x==0)
            if(y==0)
                System.out.printf("Origem\n");
            else
                System.out.printf("Eixo Y\n");
        else
            if(y==0)
                System.out.printf("Eixo X\n");
            else
                if (x>0)
                    if(y>0)
                        System.out.printf("Q1\n");
                    else
                        System.out.printf("Q4\n");
                else
                    if(y>0)
                        System.out.printf("Q2\n");
                    else
                        System.out.printf("Q3\n");

    }
    
}