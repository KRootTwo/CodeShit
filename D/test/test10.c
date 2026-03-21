#include <stdio.h>

int main() {
    
    int a = 1025;
    int *p;
    p = &a;

    printf("%p\n", p);
    
    return 0;
}