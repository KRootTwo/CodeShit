#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    
    printf("How many nigga? ");
    int n;
    scanf("%d", &n);
    int *a = malloc(n * sizeof(*a));
    printf("Enter numbers: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    printf("Here's yo ints dumbass: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }

    printf("\nEnter new size nigga: ");
    int m;
    scanf("%d", &m);
    if (m < n || a == NULL) goto error;
    int *temp = realloc(a, m * sizeof(*a));
    a = temp;
    printf("Enter numbers: ");
    for (int i = n; i < m; i++) {
        scanf("%d", &a[i]);
    }
    printf("Here's yo ints dumbass: ");
    for (int i = 0; i < m; i++) {
        printf("%d ", a[i]);
    }
    printf("\n");

    error:
    free(a);
    a = NULL;
    return 0;
}