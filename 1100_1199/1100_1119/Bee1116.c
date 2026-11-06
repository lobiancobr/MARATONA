#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        int X, Y;
        scanf("%d %d", &X, &Y);

        if (Y == 0) {
            printf("divisao impossivel\n");
        } else {
            printf("%.1f\n", (double) X / Y);
        }
    }

    return 0;
}