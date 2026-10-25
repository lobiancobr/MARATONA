#include <stdio.h>

int main() {
    int N, numero;
    int dentro = 0;

    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        scanf("%d", &numero);
        if (numero >= 10 && numero <= 20) {
            dentro++;
        }
    }

    printf("%d in\n", dentro);
    printf("%d out\n", N - dentro);

    return 0;
}