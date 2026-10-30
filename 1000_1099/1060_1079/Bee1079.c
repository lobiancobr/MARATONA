#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        double a, b, c;
        scanf("%lf %lf %lf", &a, &b, &c);

        double media = (a * 2 + b * 3 + c * 5) / 10.0;
        printf("%.1f\n", media);
    }

    return 0;
}