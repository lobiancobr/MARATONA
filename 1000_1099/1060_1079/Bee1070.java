import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        for(int i=0;i<6;)
        {
            if(X%2==1)
            {
                System.out.println(X);
                i++;
                X++;
            }
            X++;
        }
    }
}