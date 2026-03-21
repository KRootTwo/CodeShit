#include <stdio.h>
#include <stdlib.h>

int main() {
    
    int n, c = 0;
    printf("Nos(-1): ");
    int *a = NULL;
    while (scanf("%d", &n) && n != -1) {
        a = realloc(a, (c + 1) * sizeof(a));
        a[c] = n;
        c++;
    }
    printf("Nos: ");
    for (int i = 0; i < c; i++) {
        printf("%d ", a[i]);
    }
    printf("\n");
    
    free(a);
    a = NULL;
    return 0;
}