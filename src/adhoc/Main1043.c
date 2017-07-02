/**Problem: 
*  Judge: 
*  Url: 
*  Auth: Iván Romero Gárcia
*  Solution: 
**/
#include <stdio.h>
#include <math.h>

int main(void)
{
    int t, n, i;
    scanf("%d", &t);
    while (t--)
    {
        scanf("%d", &n);
        for (i = 0; i <= log2(n); i++)
        {
            if ((n & (1 << i)) != 0)
            {
                printf("%d ", i);
            }
        }
        printf("\n");
    }
    return 0;
}