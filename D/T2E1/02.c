#include <stdio.h>
#define max_id 5

void prtArr (int[], size_t);

int main() {

    int ids[max_id];
    size_t l = sizeof(ids)/sizeof(ids[0]);

    ids[0] = 9;
    ids[1] = 3;
    ids[2] = 5;
    ids[3] = 4;
    ids[4] = 0x8;

    prtArr(ids, l);

    return 0;
}
void prtArr (int a[], size_t l) {
    for (size_t i = 0; i < l; i++) {
        printf("%d\n", a[i]);
    }
}