/**Problem: 1237 - Mean Median Problem
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Utilizar la siguiente formula: (a-(b-a)).
**/
#include <stdio.h>

int main(void){
    int a,b;
    while(scanf("%d %d", &a, &b), a||b){
        printf("%d\n", (a-(b-a)));
    }
    return 0;
}