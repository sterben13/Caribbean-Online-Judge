/**Problem: 2060 - In Debt
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: el problema solo nos pide dar el numero de veces que se realiza el 
*  cobro, para solucionar el problema solo hay que ir sumando las deudas e ir preguntando si la   *  sumatoria es divisible entre si 100 si es asi ir aumentando el contador.
**/
#include <stdio.h>

int main(void){
    int n, p, payment, cont;    
    while(1){
        scanf("%d",&n);
        if(n==-1)break;
        payment=cont=0;
        while(n--){
            scanf("%d",&p);
            payment+=p;
            if(payment%100==0){
                cont++;
                payment=0;
            }
        }
        printf("%d\n",cont);
    }   
    return 0;
}