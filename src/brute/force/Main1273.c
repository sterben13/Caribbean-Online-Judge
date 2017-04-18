/**Problem: 1273 - Domino Factory
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Utilizando la siguiente formula podemos obtener el materia necesario
*  para construir el domino ((((n+1)*(n+2))/2)*(l*w))
**/
#include <stdio.h>

int main(void){
    long t, n, l, w;
    scanf("%ld",&t);
    while(t--){
        scanf("%ld %ld %ld", &n, &l, &w);
        printf("%ld\n",((((n+1)*(n+2))/2)*(l*w)));
    }
    return 0;
}

