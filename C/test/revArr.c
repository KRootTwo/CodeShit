#include <stddef.h>
#include <stdio.h>
#include <stdbool.h>

void ptrArr(int a[], size_t s) {
    printf("[ ");
    for (size_t i = 0; i < s; i++) {
        printf("%d ", a[i]);
    }
    printf("]\n");
}
void revArr(int a[], size_t s) {
    for (size_t i = 0; i < s/2; i++) {
        int temp = a[i];
        a[i] = a[s - i - 1];
        a[s - i - 1] = temp;
    }
}
int main() {
    
    int a[] = {1, 2, 3, 4, 5, 6, 7};
    size_t s = sizeof(a)/sizeof(a[0]);
    
    ptrArr(a, s);
    revArr(a, s);
    ptrArr(a, s);

    return 0;
}