#include <stdio.h>
 
int main() {
 
    int N, T, i;
    scanf("%d", &T);
    
    for(i=0; i<T; i++)
    {
        scanf("%d",&N);
        if(N == 0)
            printf("NULL\n");
        else
            if(N %2 ==0) //par
            {
                printf("EVEN ");
                if(N>0)
                    printf("POSITIVE\n");
                else
                    printf("NEGATIVE\n");
            }
            else //impar
            {
                printf("ODD ");
                if(N>0)
                    printf("POSITIVE\n");
                else
                    printf("NEGATIVE\n");
            }
    }
    return 0;
}