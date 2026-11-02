#include <stdio.h>
 
int main() {
 
    int X, Y;
    
    while(1) //laço infinito
    {
        scanf("%d",&X);
        scanf("%d",&Y);
        
        if(X==0 || Y==0)
           break;
        else
        {
            if(X>0)
               if(Y>0)
                  printf("primeiro\n");
               else
                  printf("quarto\n");
            else
               if(Y>0)
                  printf("segundo\n");
               else
                  printf("terceiro\n");
        }
    }

    return 0;
}