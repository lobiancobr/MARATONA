#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        int X, Y;
        scanf("%d %d", &X, &Y);

        int menor = (X < Y) ? X : Y;
        int maior = (X < Y) ? Y : X;

        int S = 0;
        for (int j = menor + 1; j < maior; j++) {
            if (j % 2 != 0) {      // ímpar (positivo ou negativo)
                S += j;
            }
        }

        printf("%d\n", S);
    }

    return 0;
}