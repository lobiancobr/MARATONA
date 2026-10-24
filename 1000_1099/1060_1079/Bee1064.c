#include <stdio.h>

int main() {
    int positivos = 0;
    double total = 0.0, N;

    for (int i = 0; i < 6; i++) {
        scanf("%lf", &N);
        if (N > 0) {
            positivos++;
            total += N;
        }
    }

    printf("%d valores positivos\n", positivos);
    if (positivos > 0)
        printf("%.1f\n", total / positivos);

    return 0;
}