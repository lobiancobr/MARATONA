import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    int N, T, i;
    Scanner input = new Scanner(System.in);
    T = input.nextInt();
    
    for(i=0; i<T; i++)
    {
        N = input.nextInt();
        if(N == 0)
            System.out.printf("NULL\n");
        else
            if(N %2 ==0) //par
            {
                System.out.printf("EVEN ");
                if(N>0)
                    System.out.printf("POSITIVE\n");
                else
                    System.out.printf("NEGATIVE\n");
            }
            else //impar
            {
                System.out.printf("ODD ");
                if(N>0)
                    System.out.printf("POSITIVE\n");
                else
                    System.out.printf("NEGATIVE\n");
            }
    }

 
    }
 
}