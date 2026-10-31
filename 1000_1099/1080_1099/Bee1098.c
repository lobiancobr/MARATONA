#include <stdio.h>

int main() {
    for (int k = 0; k <= 10; k++) {          // k = 0..10 → I = 0.0 .. 2.0
        double i = k * 0.2;
        for (int m = 1; m <= 3; m++) {
            double j = i + m;
            // Verifica se i e j são inteiros (parte decimal ~ 0)
            int i_inteiro = (i == (int)i);
            int j_inteiro = (j == (int)j);

            if (i_inteiro && j_inteiro)
                printf("I=%.0f J=%.0f\n", i, j);
            else if (i_inteiro)
                printf("I=%.0f J=%.1f\n", i, j);
            else if (j_inteiro)
                printf("I=%.1f J=%.0f\n", i, j);
            else
                printf("I=%.1f J=%.1f\n", i, j);
        }
    }
    return 0;
}