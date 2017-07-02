/**Problem: 
*  Judge: 
*  Url: 
*  Auth: Iván Romero Gárcia
*  Solution: 
**/
#include <stdio.h>
#include <math.h>

int main(void){
    int n, r;
    scanf("%d",&n);
    while(n){     
        r = (pow(n,2)-(n-1));
        printf("%d => %d\n", n, r);
        scanf("%d",&n);
    }
    return 0;
}