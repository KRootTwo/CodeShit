#include <stdio.h>

void swap(int *, int *);

int main() {

    char z[20];
    int a;
    int b;
    
    printf("Enter 2 numbers: ");
    fgets(z, sizeof(z), stdin);
    sscanf(z, "%d %d", &a, &b);
    printf("\nBefore swap:\n1st no. %d\n2nd no. %d\n", a, b);
    
    swap(&a, &b);

    printf("\nAfter swap:\n1st no. %d\n2nd no. %d\n", a, b);
    
    return 0;
}

void swap(int *i, int *j) {
    int temp = *i;
    *i = *j;
    *j = temp;
    printf("\nInside swap:\n1st no. %d\n2nd no. %d\n", *i, *j);
}