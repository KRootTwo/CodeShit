#include <stdio.h>
#include <stdbool.h>
#include <stddef.h>

typedef union {
    int a;      // 1
    long b;     // 2
    float c;    // 3
    double d;   // 4
    char e;     // 5
} data;
int main() {
    int n;
    printf("1. int\n2. long\n3. float\n4. double \n5. char\n6. bool\nEnter type of input: ");
    scanf("%d", &n);
    if (n < 1 || n > 5) {
        printf("Invalid input");
        return 1;
    }
    data dat;
    
    printf("Enter input: ");
    switch (n) {
        case 1:
            scanf("%d", &dat.a);
            printf("Here u go nigga: ");
            printf("%d\n", dat.a);
            break;
        case 2:
            scanf("%ld", &dat.b);
            printf("Here u go nigga: ");
            printf("%ld\n", dat.b);
            break;
        case 3:
            scanf("%f", &dat.c);
            printf("Here u go nigga: ");
            printf("%f\n", dat.c);
            break;
        case 4:
            scanf("%lf", &dat.d);
            printf("Here u go nigga: ");
            printf("%lf\n", dat.d);
            break;
        case 5:
            scanf(" %c", &dat.e);
            printf("Here u go nigga: ");
            printf("%c\n", dat.e);
            break;
    }
    printf("%d\n", dat.a);
    printf("%ld\n", dat.b);
    printf("%f\n", dat.c);
    printf("%lf\n", dat.d);
    printf("%c\n", dat.e);
    return 0;
}