#include <stdio.h>

int main() {
    // char shit[50];

    int i = 3;
    int *j;
    j = &i;
    
    printf("Address of i = %p\n", &i);
    printf("Address of j = %p\n", &j);
    printf("Address of i = %p\n", j);
    printf("Value if j = %p\n", j);
    printf("Value if i = %d\n", i);
    printf("Value if i = %d\n", *j);
    printf("Value if i = %d\n", *(&i));

    return 0;
}