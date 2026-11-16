#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    int anterior = 0;
    int atual = 1;

    for (int i = 1; i <= N; i++) {
        if (i == N) {
            printf("%d", anterior);
        } else {
            printf("%d ", anterior);
        }

        int temp = anterior + atual;
        anterior = atual;
        atual = temp;
    }

    printf("\n");
    return 0;
}