#include <stdio.h>
 
int main() {
 
    int N, i;
    
    scanf("%d",&N);
    
    for(i=0; i<N; i++)
        printf("%d %d %d PUM\n", 4*i+1,4*i+2,4*i+3);
 
    return 0;
}