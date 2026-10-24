#include <stdio.h>
 
int main() {
 
    double S;
    scanf("%lf",&S);
    
    if(S<=2000)
		printf("Isento\n");
	else
	if(S<=3000)
		printf("R$ %.2lf\n", (S-2000)*.08);
	else
	if(S<=4500)
		printf("R$ %.2lf\n", 80+(S-3000)*.18);
	else
		printf("R$ %.2lf\n", 350+(S-4500)*.28);

    return 0;
}