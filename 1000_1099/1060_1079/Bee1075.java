import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 2; i < 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}