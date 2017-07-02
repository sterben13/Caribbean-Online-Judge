/**Problem: 
*  Judge: 
*  Url: 
*  Auth: Iván Romero Gárcia
*  Solution: 
**/
#include <stdio.h>

int main() {
    int n, e, f, c, obt, res, sum, totalDay;
    scanf("%d", &n);
    while (n--) {
        scanf("%d %d %d", &e, &f, &c);
        totalDay = e + f;
        sum = 0;
        if (c == 1) {
            printf("0\n");
            continue;
        }
        while (1) {
            obt = totalDay / c;
            res = totalDay % c;
            sum += obt;
            totalDay = obt + res;
            if (totalDay < c)break;
        }
        printf("%d\n", sum);
    }
    return 0;
}