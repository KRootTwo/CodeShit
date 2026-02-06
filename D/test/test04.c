#include <stdio.h>

void minmax(int *, int *, int *, int *);

int main() {
    char z[10];
    int i, j, mx, mn;
    char extra;

    printf("Enter two numbers: ");
    fgets(z, sizeof(z), stdin);

    if (sscanf(z, "%5d %5d %c", &i, &j, &extra) != 2) {
        printf("Invalid input. Enter only two small integers.\n");
    }
    else {
        minmax(&i, &j, &mx, &mn);
        printf("\nMax = %d\nMin = %d\n", mx, mn);
    }

    return 0;
}

void minmax(int *a, int *b, int *max, int *min) {
    if (*a > *b) {
        *max = *a;
        *min = *b;
    }
    else if (*a < *b) {
        *max = *b;
        *min = *a;
    }
    else {
        *max = *a;
        *min = *b;
    }
}