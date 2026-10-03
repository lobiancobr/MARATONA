#include <stdio.h>
 
int main() {
 
    int A, B, C, Mab, Mabc;
    
    scanf("%d", &A);
    scanf("%d", &B);
    scanf("%d", &C);
    
    Mab = (A + B + abs(A-B))/2;
    Mabc= (C + Mab + abs(C-Mab))/2;
    
    printf("%d eh o maior\n",Mabc);
 
    return 0;
}