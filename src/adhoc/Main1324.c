/**Problem: 
*  Judge: 
*  Url: 
*  Auth: Iván Romero Gárcia
*  Solution: 
**/
#include <stdio.h>

int main(void)
{
    int a[9], i, aux, j, i1, i2, i3, i4, i5, i6, i7, r[7];
    for (i = 0; i < 9; i++)
        scanf("%d", &a[i]);

    for (i = 1; i < 9; i++)
    {
        j = i;
        aux = a[i];
        while (j > 0 && aux < a[j - 1])
        {
            a[j] = a[j - 1];
            j = j - 1;
        }
        a[j] = aux;
    }
    /*printf("\n\nLos elementos ordenados del arreglo son \n");
    for (i = 0; i < 9; i++)
    {
        printf("Elemento[%d]  %d\n", i, a[i]);
    }*/
    for (i1 = 0; i1 <= 2; i1++)
        for (i2 = i1 + 1; i2 <= 3; i2++)
            for (i3 = i2 + 1; i3 <= 4; i3++)
                for (i4 = i3 + 1; i4 <= 5; i4++)
                    for (i5 = i4 + 1; i5 <= 6; i5++)
                        for (i6 = i5 + 1; i6 <= 7; i6++)
                            for (i7 = i6 + 1; i7 <= 8; i7++)
                                if (a[i1] + a[i2] + a[i3] + a[i4] + a[i5] + a[i6] + a[i7] == 100)
                                {
                                    r[0] = a[i1];
                                    r[1] = a[i2];
                                    r[2] = a[i3];
                                    r[3] = a[i4];
                                    r[4] = a[i5];
                                    r[5] = a[i6];
                                    r[6] = a[i7];
                                }

    for (i = 0; i < 7; i++)
        printf("%d\n", r[i]);

    return 0;
}