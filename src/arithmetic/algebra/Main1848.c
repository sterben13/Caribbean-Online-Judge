/**Problem: 1848 - Fibonacci Terms
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: obtener la serie fionacci desde 1 hasta 10000
**/
#include <stdio.h>
#define tam 10000
#define mod 10000

int a[tam+1];

void fib(){
    int i=3;
    a[0]=0;
    a[1]=1;
    a[2]=1;
    for(i = 3; i <= tam; i++){
        a[i] = (a[i-1]+a[i-2])%mod;
    }
}

void printFib(int n){
    if(n==1) printf("%d %d %d\n",a[0], a[0], a[1]);
    if(n==2) printf("%d %d %d\n",a[0], a[1], a[2]);
    if(n>=3) printf("%d %d %d\n",a[n-2], a[n-1], a[n]);
}

int main(void){
    int t, n;
    fib();
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        printFib(n);
    }
    return 0;
}