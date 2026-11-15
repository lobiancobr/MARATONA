#include <stdio.h>

int main() {
    int A, N;

    scanf("%d", &A);

    do {
        scanf("%d", &N);
    } while (N <= 0);

    int soma = N * (2 * A + N - 1) / 2;

    printf("%d\n", soma);

    return 0;
}