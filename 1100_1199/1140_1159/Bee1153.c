#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    long long fatorial = 1;
    for (int i = 1; i <= N; i++) {
        fatorial *= i;
    }

    printf("%lld\n", fatorial);

    return 0;
}