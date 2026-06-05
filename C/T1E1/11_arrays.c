#include <stddef.h>
#include <stdio.h>

char z[20];
void rArr(int arr[], size_t len);
void pArr(int arr[], size_t len);

int main() {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    size_t l = sizeof(arr)/sizeof(arr[0]);

    pArr(arr, l);


    return 0;
}

void rArr(int arr[], size_t len) {
    for (size_t i = 0; i < len; i++) {
        printf("Enter integer: ");
        fgets(z, sizeof(z), stdin);
        sscanf(z, "%d", &arr[i]);
    }
}

void pArr(int arr[], size_t len) {
    for (size_t i = 0; i < len; i++) {
        printf("%d\n", arr[i]);
    }
}