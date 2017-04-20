/**Problem: 2693 - Rounding Probabilities
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: 
 * */
package other;
#include<stdio.h>

void rounding(double number, int position){
    switch(position){
        case 1:
            printf("%.1f\n",number);
            break;
        case 2:
            printf("%.2f\n",number);
            break;
        case 3:
            printf("%.3f\n",number);
            break;
        case 4:
            printf("%.4f\n",number);
            break;
        case 5:
            printf("%.5f\n",number);
            break;
        case 6:
            printf("%.6f\n",number);
            break;
    }
}

int main(void){
    double t;
    int n;
    scanf("%lf %d",&t,&n);
    rounding(t, n);
    return 0;
}