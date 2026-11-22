#include <stdio.h>

int main() {
    int N;
    double soma = 0.0;   // double é mais preciso que float
    int count = 0;

    while (1) {
        scanf("%d", &N);

        if (N < 0) {
            break;
        }

        soma += N;
        count++;
    }

    if (count > 0) {
        printf("%.2f\n", soma / count);
    }

    return 0;
}