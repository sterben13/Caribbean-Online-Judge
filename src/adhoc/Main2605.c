/**Problem: 2605 - Beautiful Yekaterinburg
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: solo hay que imprimir la posicion del siguiente string 1723.
**/
#include <stdio.h>

int main(void){
    int digit;
    scanf("%d",&digit);
    printf((digit==1)?"1":(digit==2)?"7":(digit==3)?"2":"3");
    printf("\n");
    return 0;
}