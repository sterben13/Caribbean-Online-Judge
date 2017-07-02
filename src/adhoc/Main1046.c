/**Problem: 
*  Judge: 
*  Url: 
*  Auth: Iván Romero Gárcia
*  Solution: 
**/
#include <stdio.h>

int main(void)
{
    int ar[1001], i, t , a, b, suma;
    for (i = 1; i < 1001; i++)
    {
        ar[i] = ((i % 100) * ((i + 1) % 100) * ((i + 2) % 100)) % 100;
    }
    scanf("%d", &t);
    while(t--){
        scanf("%d %d", &a, &b);
        suma=0;
        for(i=a;i<=b;i++){
            suma=(suma+ar[i])%100;
        }
        printf("%d\n", suma);
    }
    return 0;
}