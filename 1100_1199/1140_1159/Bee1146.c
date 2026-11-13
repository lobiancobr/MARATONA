#include <stdio.h>

int main() {
    int N;

    while (scanf("%d", &N) == 1 && N != 0) {
        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                printf("%d", i);       // primeiro sem espaço antes
            } else {
                printf(" %d", i);      // demais com espaço antes
            }
        }
        printf("\n");                  // quebra de linha no final
    }

    return 0;
}