import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        double A, R, PI=3.14159;
        R = input.nextDouble();
        A=PI*R*R;
        System.out.printf("A=%.4f\n",A);
    }
 
}