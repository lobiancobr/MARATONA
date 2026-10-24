import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int i=0, qtd=0;
        double n=0;
        
        for(i=0;i<6;i++)
        {
            n = input.nextDouble();
            if(n>0)
                qtd++;
        }
        System.out.printf("%d valores positivos\n",qtd);

    }
 
}