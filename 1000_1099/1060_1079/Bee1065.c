#include <stdio.h>
 
int main() {
 
    int i, qtd=0;
    int n;
    
    for(i=0;i<5;i++)
    {
        scanf("%d",&n);
        if(n%2==0)
            qtd++;
    }
    printf("%d valores pares\n",qtd);
 
    return 0;
}