#include <stdio.h>

int main() {

    char blehh[50];
    int a;
    char b[10] = "";

        printf("Entre sum int: ");
        fgets(blehh, sizeof(blehh), stdin);
        sscanf(blehh, "%d", &a);
        printf("Siuuu nigg %d\n", a);
        
        printf("Entre sum Strings: ");
        fgets(blehh, sizeof(blehh), stdin);
        sscanf(blehh, "%s", b);
        printf("Siuuu nigg %s\n", b);


    return 0;
}