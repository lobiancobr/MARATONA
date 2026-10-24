#include <stdio.h>
#include <string.h>

int main() {
    char nivel1[20], nivel2[20], nivel3[20];
    
    scanf("%19s", nivel1);
    scanf("%19s", nivel2);
    scanf("%19s", nivel3);
    
    if (strcmp(nivel1, "vertebrado") == 0) {
        if (strcmp(nivel2, "ave") == 0) {
            if (strcmp(nivel3, "carnivoro") == 0)
                printf("aguia\n");
            else
                printf("pomba\n");
        } else {  /* mamifero */
            if (strcmp(nivel3, "onivoro") == 0)
                printf("homem\n");
            else
                printf("vaca\n");
        }
    } else {  /* invertebrado */
        if (strcmp(nivel2, "inseto") == 0) {
            if (strcmp(nivel3, "hematofago") == 0)
                printf("pulga\n");
            else
                printf("lagarta\n");
        } else {  /* anelideo */
            if (strcmp(nivel3, "hematofago") == 0)
                printf("sanguessuga\n");
            else
                printf("minhoca\n");
        }
    }
    return 0;
}