#include <stdio.h>
 
int main() {
 
    int i, menor, maior, aux, total=0;
    
    scanf("%d",&menor);
    scanf("%d",&maior);
    
    if(menor > maior)
    {
        aux=menor;
        menor=maior;
        maior=aux;
    }
    
    for(i=menor; i<=maior; i++)
        if(i%13>0)
            total+=i;
    
    printf("%d\n",total);
 
    return 0;
}