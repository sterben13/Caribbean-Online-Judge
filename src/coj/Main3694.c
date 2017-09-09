#include <stdio.h>

int main(void){
    int n, i, result;
    while(scanf("%d", &n), n){
        i = 1;
        result = 0;
        while(i*i*i<=n){
            if(n%(i*i*i)==0){
                result++;
            }
            i++;
        }
        printf("%d\n", result);
    }
    return 0;
}