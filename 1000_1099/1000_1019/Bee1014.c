#include <stdio.h>
 
int main() {
 
    int    X; // distancia
    double Y; // combustivel
    
    scanf("%d",&X);
    scanf("%lf",&Y);
    
    printf("%.3lf km/l\n",X/Y);
 
    return 0;
}