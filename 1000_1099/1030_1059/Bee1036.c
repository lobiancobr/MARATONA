#include <stdio.h>
#include <math.h>
 
int main() {
 
    double A, B, C, D, delta;
    scanf("%lf",&A);
    scanf("%lf",&B);
    scanf("%lf",&C);
    
    delta=B*B-4*A*C;
    D = sqrt(delta);
    if (delta < 0 || A == 0)
        printf("Impossivel calcular\n");
    else
    {
        printf("R1 = %.5f\n", (-B + D)/(2*A));
        printf("R2 = %.5f\n", (-B - D)/(2*A));
    }
    return 0;
}