#include <stdio.h>

int main() {
    double S = 1;
    double den = 2;
    
    for(int i=3; i<=39; i+=2, den*=2)
        S += (i/den);
        
    printf("%.2f\n",S);
    
    return 0;
}