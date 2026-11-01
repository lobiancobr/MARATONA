#include <stdio.h>

int main() {
    int X, Y;

    while (1) {
        scanf("%d %d", &X, &Y);

        if (X == Y) {
            break;
        }

        if (X < Y) {
            printf("Crescente\n");
        } else {
            printf("Decrescente\n");
        }
    }

    return 0;
}