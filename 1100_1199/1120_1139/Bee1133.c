#include <stdio.h>

int main() {
    int X, Y;
    scanf("%d %d", &X, &Y);

    int menor = (X < Y) ? X : Y;
    int maior = (X > Y) ? X : Y;

    for (int i = menor + 1; i < maior; i++) {
        if (i % 5 == 2 || i % 5 == 3) {
            printf("%d\n", i);
        }
    }

    return 0;
}