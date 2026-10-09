#include <stdio.h>
 
int main() {
 
    int codigo, quantidade;
    float total;
    
    scanf("%d",&codigo);
    scanf("%d",&quantidade);
    
    switch (codigo)
    {
        case 1: total=4*quantidade ; break;
        case 2: total=4.5*quantidade ; break;
        case 3: total=5*quantidade ; break;
        case 4: total=2*quantidade ; break;
        case 5: total=1.5*quantidade ; break;
    }
    
    printf("Total: R$ %.2f\n", total);
    
    return 0;
}