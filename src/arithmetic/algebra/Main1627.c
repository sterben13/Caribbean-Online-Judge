/**Problem: 1627 - Counting Zeros
*  Judge: Caribbean Online Judge
*  Url: http://coj.uci.cu/24h/problem.xhtml?pid=1627
*  Auth: Iván Romero Gárcia
*  Solution: Sumatoria de n/5^i donde i={1,2,3,4...i};
**/
#include <stdio.h>

int main(){
    int t,i, n, cero;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        cero=0;
        for(i = 5; n/i >=1; i*=5){
            cero+=n/i;
        }
        printf("%d\n", cero);
    }
    return 0;
}
