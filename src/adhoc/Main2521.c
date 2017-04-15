/**Problem: 2521 - Zero or One.
 *  Judge: Caribbean Online Judge.
 *  Auth: Iván Romero Gárcia.
 *  Solution: en este problema solo hay que checa cual de los tres es diferente a los otros dos
 *  utilizando sentencias if se imprimira el resultado correspondiente.
 **/
#include <stdio.h>

int main(void) {
    int a, b, c;
    while (scanf("%d %d %d", &a, &b, &c) == 3) {
        if (a != b && a != c) {
            printf("A\n");
        } else if (b != a && b != c) {
            printf("B\n");
        } else if (c != a && c != b) {
            printf("C\n");
        } else {
            printf("*\n");
        }
    }
    return 0;
}