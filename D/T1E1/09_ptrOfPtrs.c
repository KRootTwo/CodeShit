#include <stdio.h>

int main() {
    // char shit[50];

    int i;
    int *j;
    int **k;

    i = 3;
    j = &i;
    k = &j;
    
    printf("Adress of i = %p\n", &i);
    printf("Adress of i = %p\n", j);
    printf("Adress of i = %p\n", *k);
    printf("Adress of i = %p\n", *(&j));
    printf("Adress of i = %p\n", &(*j));
    printf("Adress of i = %p\n", *(*(&k)));
    printf("Adress of i = %p\n", *(&(*k)));
    printf("\n");
    printf("Adress of j = %p\n", k);
    printf("Adress of j = %p\n", &j);
    printf("Adress of j = %p\n", *(&k));
    printf("Adress of j = %p\n", &(*k));
    // printf("Adress of j = %p\n", );
    

    return 0;
}