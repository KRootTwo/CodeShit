#include <stddef.h>
#include <stdio.h>

int main() {
    
    int a[10] = {9};

    int *p;
    // int *q;
    
    p = &a[0];

    // q = &a[1];

    // printf("%p\n", p);
    // printf("%p\n", q);
    // printf("%p\n", p + 1);

    *p = 3;
    *(p + 1) = 4;
    *(p + 2) = 5;
    *(p + 3) = 6;
    *(p + 4) = 7;
    *(p + 5) = 8;
    *(p + 6) = 9;

    for (size_t i = 0; i < sizeof(a)/sizeof(a[0]); i++) {
        printf("%d\n", i[a]);
    }


    
    return 0;
}