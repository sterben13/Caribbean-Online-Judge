/**Problem: 1025 - Democracy in danger
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Ordenar los votos de menor a mayor y sumar los valores del arreglo
*  de de 0 a n/2+1, dividiendo los valores a la mitad entre 2 mas 1.
**/
#include <stdio.h>
int a [101];

void swap(int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

void sorting(int n){
    int i, j, bound, newbound;
    bound = n - 2;
    for (i = 1; i < n; i++){
        newbound = 0;
        for (j = 0; j <= bound; j++){
            if (a[j] > a[j + 1]){
                swap(j, j + 1);
                newbound = j - 1;
            }
        }
        bound = newbound;
    }
}

int main(void){
    int k, i, suma=0;
    scanf("%d",&k);
    for(i = 0; i < k; i++){
        scanf("%d",&a[i]);
    }
    sorting(k);
    for(i = 0; i < k/2+1; i++){
        suma += (a[i]/2+1);
    }
    printf("%d\n",suma);
    return 0;
}