import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException 
    {
        int i, N, Pares=0;
        
        Scanner input = new Scanner(System.in);
        
        for(i=0; i<5; i++)
        {
            N = input.nextInt();
            if(N%2==0)
                Pares++;
        }
        
        System.out.printf("%d valores pares\n", Pares);

    }
 
}