#include <stdio.h>

int main () {
    char a[5] = "";
    int n = 0;

    blehh : // label

    printf("Entre NUmber([1-9][-1 = stop]): ");
    fgets(a, sizeof(a), stdin);
    sscanf(a, "%d", &n);

    if (n == 1 || n ==2 || n == 3 || n == 4 ){
        printf("Low Level Mentality (Orangutan).\n");
        goto blehh; // jump to label
    }
    else if (n == 5) {
        printf("Mid Mentality (Legend)\n");
        goto blehh;
    }
    else if (n == 6 || n == 7 || n == 8 || n == 9) {
        printf("Vile Mentality (J. Cole).\n");
        goto blehh;
    }
    else if (n == -1) {
        printf("Dickhead\n");
    }
    else if (n == 0) {
        printf("Pure Twat\n");
    }
    else {
        printf("Pure Knob.\n");
        goto blehh;
    }


    return 0;
}




/*
label "goto" operator Now Deprecated(not used)

*/