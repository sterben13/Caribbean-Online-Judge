/**Problem: 2145 - Beauty Contest
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: ordenar los 10 numeros y sumar desde el indice del 1 hasta 9.
 **/
#include <stdio.h>

int score[10];

void swap(int i, int j) {
    int temp = score[i];
    score[i] = score[j];
    score[j] = temp;
}

void bubbleSort4() {
    int i, j, n, bound, newbound;
    n = 10;
    bound = n - 2;
    for (i = 1; i < n; i++) {
        newbound = 0;
        for (j = 0; j <= bound; j++) {
            if (score[j] > score[j + 1]) {
                swap(j, j + 1);
                newbound = j - 1;
            }
        }
        bound = newbound;
    }
}

int points() {
    int pointsScore = 0, i;
    bubbleSort4();
    for (i = 1; i < 9; i++) {
        pointsScore += score[i];
    }
    return pointsScore;
}

int main(void) {
    int girls, i, g = 1;
    scanf("%d", &girls);
    while (girls--) {
        for (i = 0; i < 10; i++) {
            scanf("%d", &score[i]);
        }
        printf("%d %d\n", g, points());
        g++;
    }
    return 0;
}