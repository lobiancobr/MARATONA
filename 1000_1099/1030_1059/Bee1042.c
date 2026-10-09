#include <stdio.h>
 
int main() {
 
    int a, b, c;
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);
    
    if(a<b)
        if(a<c)
            if(b<c)
                printf("%d\n%d\n%d\n",a,b,c);
            else
                printf("%d\n%d\n%d\n",a,c,b);
        else
            if(a<b)
                printf("%d\n%d\n%d\n",c,a,b);
            else
                printf("%d\n%d\n%d\n",c,b,a);
    else // b<a
        if(b<c)//b<a b<c
            if(a<c)
                printf("%d\n%d\n%d\n",b,a,c);
            else
                printf("%d\n%d\n%d\n",b,c,a);
        else // b<a c<b
            //if(a<c)
                //printf("%d\n%d\n%d\n",c,a,b);
            //else
                printf("%d\n%d\n%d\n",c,b,a);
                

    // imprime na ordem de entrada            
    printf("\n%d\n%d\n%d\n",a,b,c);

    return 0;
}