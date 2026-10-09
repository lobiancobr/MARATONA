#include <stdio.h>
 
int main() {
 
    float N1, N2, N3, N4, NExame, media, Final;
    
    scanf("%f",&N1);
    scanf("%f",&N2);
    scanf("%f",&N3);
    scanf("%f",&N4);
    
    media =(2*N1 + 3*N2 + 4*N3 + N4)/10.0;
    
    if(media<7 && media>=5)
        scanf("%f",&NExame);
        
    printf("Media: %.1f\n",media);
    
    if(media<5)
        printf("Aluno reprovado.\n");
    else
    if(media>=7)
        printf("Aluno aprovado.\n");
    else
    {
        printf("Aluno em exame.\n");
        printf("Nota do exame: %.1f\n",NExame);
        Final=(media+NExame)/2.0;
        if (Final < 5)
            printf("Aluno reprovado.\n");
        else
            printf("Aluno aprovado.\n");
        printf("Media final: %.1f\n",Final);
    }
    
    return 0;
}