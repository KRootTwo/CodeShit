#include <stdio.h>
#include <stdlib.h>

int main() {
    
    printf("How many nigga? ");
    int n;
    scanf("%d", &n);
    int *a = malloc(n * sizeof(*a));
    printf("Enter Numbers: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    printf("Here's yo ints dumbass: \n");
    for (int i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }
    printf("\n");
    free(a);
    a = NULL;
    return 0;
}