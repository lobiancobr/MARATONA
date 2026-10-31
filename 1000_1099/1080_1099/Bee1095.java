import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        for(int J=60,I=1; J>=0; J-=5,I+=3)
            System.out.printf("I=%d J=%d\n",I,J);
 
    }
 
}