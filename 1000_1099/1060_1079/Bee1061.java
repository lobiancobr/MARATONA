import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Linha 1: "Dia 5"
        sc.next();                    // consome "Dia"
        int d1 = sc.nextInt();
        sc.nextLine();                // consome o resto da linha

        // Linha 2: "08 : 12 : 23"
        int h1 = sc.nextInt();
        sc.next();                    // consome ":"
        int m1 = sc.nextInt();
        sc.next();                    // consome ":"
        int s1 = sc.nextInt();
        sc.nextLine();

        // Linha 3: "Dia 9"
        sc.next();
        int d2 = sc.nextInt();
        sc.nextLine();

        // Linha 4: "06 : 13 : 23"
        int h2 = sc.nextInt();
        sc.next();
        int m2 = sc.nextInt();
        sc.next();
        int s2 = sc.nextInt();

        // Cálculo
        int s = s2 - s1;
        int m = m2 - m1;
        int h = h2 - h1;
        int d = d2 - d1;

        if (s < 0) { s += 60; m--; }
        if (m < 0) { m += 60; h--; }
        if (h < 0) { h += 24; d--; }

        System.out.printf("%d dia(s)%n", d);
        System.out.printf("%d hora(s)%n", h);
        System.out.printf("%d minuto(s)%n", m);
        System.out.printf("%d segundo(s)%n", s);

        sc.close();
    }
}