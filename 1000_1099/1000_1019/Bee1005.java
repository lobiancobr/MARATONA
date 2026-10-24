import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        double N1 = input.nextDouble();
        double N2 = input.nextDouble();

        System.out.printf("MEDIA = %.5f\n", 
                          (N1*3.5+N2*7.5)/11);

    }
 
}