/** Problem: 1123 - Ugly Numbers II
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: Utilizando programacion dinamica obtener los multiplos de 2,3,5
 * */
#include <stdio.h>
#include <math.h>
int ugly[1501];
/*long factor(int m, int n){
    while(m%n==0){
        m/=n;  
    }
    return m;
}

int isUgly(int n){
    n=factor(n, 2);
    n=factor(n, 3);
    n=factor(n, 5);
    return (n==1)?1:0;
}

void generateUgly(){
    int i, j;
    ugly[1]=1;
    ugly[2]=2;
    ugly[3]=3;
    ugly[4]=4;
    ugly[5]=5;
    for(i = 6, j=6; j < 1501; i++){
        if(isUgly(i)){
            ugly[j]=i;
            j++;
        }
    }
}*/
int min(int a, int b){
    if(a==b){
        return a;
    }
    return (a<b)?a:b;
}

void generateUgly(){
    ugly[1]=1;
    int i2=1, i3=1, i5=1;
    int multiple_of_2 = 2;
    int multiple_of_3 = 3;
    int multiple_of_5 = 5;
    int next_ugly;
    for(int i = 2; i < 1501; i++){
        next_ugly=min(min(multiple_of_2, multiple_of_3), multiple_of_5);
        ugly[i]=next_ugly;
        if(next_ugly==multiple_of_2){
            i2++;
            multiple_of_2=ugly[i2]*2;
        }
        if(next_ugly==multiple_of_3){
            i3++;
            multiple_of_3=ugly[i3]*3;
        }
        if(next_ugly==multiple_of_5){
            i5++;
            multiple_of_5=ugly[i5]*5;
        }
    }
}

int main(void) {
    int n;
    generateUgly();
    while(scanf("%d",&n), n){
        printf("%d\n",ugly[n]);   
    }
    return 0;
}

