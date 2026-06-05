#include <stdio.h>
#include <stdlib.h>

int main() {
    
    int *a = malloc(1 * sizeof(*a));
    char shit[20];
    printf("Enter an int: ");
    fgets(shit, sizeof(shit), stdin);
    sscanf(shit, "%d", &a[0]);
    printf("Here's yo int dumbass %d\n", a[0]);

    free(a);
    a = NULL;
    return 0;
}