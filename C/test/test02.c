#include <stdio.h>

int main() {

    int a = 67;
    int *b = &a;
    
    printf("%d\n", a);
    *b = 69;

    printf("%d\n", a);

    return 0;
}