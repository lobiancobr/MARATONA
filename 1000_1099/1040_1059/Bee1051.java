import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner input = new Scanner(System.in);
    double S = input.nextDouble();

    if(S<=2000)
		System.out.printf("Isento\n");
	else
	if(S<=3000)
		System.out.printf("R$ %.2f\n", (S-2000)*.08);
	else
	if(S<=4500)
		System.out.printf("R$ %.2f\n", 80+(S-3000)*.18);
	else
		System.out.printf("R$ %.2f\n", 350+(S-4500)*.28);
 
    }
 
}