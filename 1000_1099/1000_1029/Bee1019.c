#include <stdio.h>
 
int main() {
 
    int N, hora, minuto, segundo;
    
    scanf("%d", &N);
    segundo = N%60;
    N/=60;
    minuto = N%60;
    N/=60;
    hora = N;
    printf("%d:%d:%d\n",hora,minuto,segundo);

 
    return 0;
}