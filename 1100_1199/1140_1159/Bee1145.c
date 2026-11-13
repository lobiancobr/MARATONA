#include <stdio.h>

int main() {
    int X, Y;
    scanf("%d %d", &X, &Y);

    for (int i = 1; i <= Y; i++) {
        if (i % X == 0 || i == Y) {
            printf("%d\n", i);   // fim de linha ou último número
        } else {
            printf("%d ", i);
        }
    }

    return 0;
}