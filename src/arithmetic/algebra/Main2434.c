/**Problem: 2434 - Mathematician Ana
*  Judge: Caribbean Online Judge
*  Url: http://coj.uci.cu/24h/problem.xhtml?pid=2434
*  Auth: Iván Romero Gárcia
*  Solution: obtener el produto de los numero primos hasta menores o igual a n
**/

#include <stdio.h>

int main(){
    int a[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    int n, i;
    long long int prod;
    while(scanf("%d",&n),n){
        prod=1;
        for(i=0;i<15;i++){
            if(a[i]<=n){
                prod*=a[i];
            }else if(a[i]>n)break;
        }
        printf("%lld\n", prod);
    }
    return 0;
}