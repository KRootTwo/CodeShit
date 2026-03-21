#include <stdio.h>
#include <stdlib.h>

int main() {
    
    printf("Enter Numbers (-1 => stop): ");
    int n, c = 0;
    int *a = NULL;
    
    while (scanf("%d", &n) && n != -1) {
        a = realloc(a, (c + 1) * sizeof(int));
        a[c] = n;
        c++;
    }
    for (int i = 0; i < c; i++) {
        printf("%d ", a[i]);
    }
    printf("\n");
    free(a);
    a = NULL;
    return 0;
}