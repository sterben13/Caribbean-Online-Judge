/**Problem: 3137 - Validate ABC
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Realizar todas las posibles operaciones con a y b y encontrar si alguna
*  de ella es igual a c, tener cuidado con operación de división por cero.
**/
#include <stdio.h>

int validate(int a, int b, int c){
    if(a+b==c){
        return 1;
    }
    if(a-b==c){
        return 1;
    }
    if(a*b==c){
        return 1;
    }
    if(b!=0){
        if(a/b==c){
        return 1;
        }
        if(a%b==c){
            return 1;
        }
    }
    return 0;
}

int main(void){
    int t, a, b, c;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d %d", &a, &b, &c);
        if(validate(a,b,c)){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
    return 0;
}