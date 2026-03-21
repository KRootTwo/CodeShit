#include <stdio.h>
#include <stdlib.h>

struct A {
    int x;
    float y;
    char z;
};
union B {
    int x;
    float y;
    char z;
};
int main() {
      
    printf("%zu\n", sizeof(struct A)); 
    printf("%zu\n", sizeof(union B)); 
    
    return 0;
}