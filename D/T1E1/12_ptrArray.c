#include <stdio.h>

char z[20];
void ppone(int *arr, size_t l);
void rArr(int arr[], size_t l);
void pArr(int arr[], size_t l);

int main() {

    int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    size_t l = sizeof(a)/sizeof(a[0]);

    pArr(a, l);
    printf("\n");
    ppone(a, l);
    pArr(a, l);

    return 0;
}

void rArr(int arr[], size_t l) {
    for (size_t i = 0; i < l; i++) {
        printf("Entre ints: ");
        fgets(z, sizeof(z), stdin);
        sscanf(z, "%d", &arr[i]);
    }
}
void pArr(int arr[], size_t l) {
    for (size_t i = 0; i < l; i++) {
        printf("%d\n", arr[i]);
    }
}
void ppone(int *arr, size_t l) {
    for (size_t i = 0; i < l - 1; i++) {
        int j = i;
        *(arr + j) = *(arr + j + 1);
    }
}