/**Problem: 1551 - TRI
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Realizar comparación para obtener la correcta operación.
**/
#include <stdio.h>

/**
 * Método obtienen la operación realizada y de que forma se realizo la 
 * asignación: 
 * a [+|-|*|/] b = c
 * a = b [+|-|*|/] c
 * @param a
 * @param b
 * @param c
 * @return 
 */
int operation(int a, int b, int c){
    if(a+b==c){
        return 1;
    }else if(a==b+c){
        return 2;
    }else if(a-b==c){
        return 3;
    }else if(a==b-c){
        return 4;
    }else if(a*b==c){
        return 5;
    }else if(a==b*c){
        return 6;
    }else if(a/b==c){
        return 7;
    }else if(a==b/c){
        return 8;
    }
}

/**
 * Imprime el corrector orden en que se realiza la operación y la asignación.
 * @param a
 * @param b
 * @param c
 */
void imprimir(int a, int b, int c){
    switch(operation(a,b,c)){
        case 1:
            printf("%d+%d=%d\n",a,b,c);
            break;
        case 2:
            printf("%d=%d+%d\n",a,b,c);
            break;
        case 3:
            printf("%d-%d=%d\n",a,b,c);
            break;
        case 4:
            printf("%d=%d-%d\n",a,b,c);
            break;
        case 5:
            printf("%d*%d=%d\n",a,b,c);
            break;
        case 6:
            printf("%d=%d*%d\n",a,b,c);
            break;
        case 7:
            printf("%d/%d=%d\n",a,b,c);
            break;
        case 8:
            printf("%d=%d/%d\n",a,b,c);
            break;
    }
}

int main(void){
    int a, b, c, i=1;
    while(scanf("%d %d %d", &a, &b, &c)!=EOF){
        printf("Case %d: ",i);
        imprimir(a,b,c);
        i++;
    }
    return 0;
}