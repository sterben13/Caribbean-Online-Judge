/**Problem: 2979 - Another Sorting Problem
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: En cada caso mediante un ciclo ir contando cuando el indice es diferente
*  al dato de entrada.
**/
#include <stdio.h>

int main(void){
    int t, n, ni, i, cont;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        cont=0;
        for(i = 1; i <= n; i++){
            scanf("%d",&ni);
            if(i!=ni)cont++;
        }
        printf("%d\n",cont);
    }
    return 0;
}