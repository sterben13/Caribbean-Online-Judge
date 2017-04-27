/**Problem: 1132 - Divisor Summation
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: obtener los divisores de 2 hasta raiz de N.
**/
#include <stdio.h>
#include <math.h>

void printSumDivisors(long n)
{
    if(n==1){
        printf("0\n");
        return;
    }
    
    long sum = 1;
    for (int i=2; i<=sqrt(n); i++)
    {
        if (n % i == 0)
        {
            if (n / i == i)
                sum += i;
            else
                sum += (i + (n / i));
        }
    }
    printf("%ld\n", sum);
}

int main(void)
{
    int t;
    long n;
    scanf("%d", &t);
    while (t--)
    {
        scanf("%ld", &n);
        printSumDivisors(n);
    }
    return 0;
}