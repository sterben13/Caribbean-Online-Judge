/**Problem: 1328 - CAVerage
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: sumar y guardar los n primeros números en la un arreglo de math
*  sumar y guardar los n+1 a n*2  números en la un arreglo de fisic
*  obtener la media de suma total entre el numero de niños y posteriormente 
*  sumar el indice i en math y fisic y si es menor e ir contando si la suma es 
*  menor que la media.
**/
#include <stdio.h>

int main(void){
    int t, n, v, math[51], fisic[51], i, child;
    double average;
    scanf("%d",&t);
    while(t--){
        average = child = 0;
        scanf("%d",&n);
        for(i = 1; i <= n ; i++){
            scanf("%d",&v);
            average+=v;
            math[i]=v;
        }
        for(i = 1; i <= n ; i++){
            scanf("%d",&v);
            average+=v;
            fisic[i]=v;
        }
        average/=n;
        for(i = 1; i <= n; i++){
            if((math[i]+fisic[i])<average){
                child++;
            }
        }
        printf("%d\n", child);
    }
    return 0;
}