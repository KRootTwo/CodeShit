#include <stdio.h>

int main() {

    int a;
    int *b;

    a = 67;
    b = &a;

    printf("%d\n", *b);

    return 0;
}