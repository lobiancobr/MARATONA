#include <stdio.h>
 
int main() {
 
    int i, X;
    scanf("%d",&X);
    
    if(X%2==0)
        X++;
    for(i=0; i<6; i++)
        printf("%d\n",X + 2*i);
 
    return 0;
}