#include <stdbool.h>
#include <stddef.h>
#include <stdio.h>
#include <math.h>

float sum(float a, float b) {
    return a + b;
}
float sub(float a, float b) {
    return a - b;
}
float mul(float a, float b) {
    return a * b;
}
float div(float a, float b) {
    return a  / b;
}
float pwr(float a, float b) {
    return pow(a, b) ;
}
float sqr(float a) {
    return pow(a, 2);
}
float sqt(float a) {
    return pow(a, 0.5);
}
float lgr(float a) {
    return log(a);
}
float rnd(float a) {
    return roundf(a); 
}
float flr(float a) {
    return floorf(a); 
}
float cil(float a) {
    return ceilf(a); 
}


int main() {

    float a = 0.0f, b = 0.0f;
    float res = 0.0f;
    int n = 0;
    int op[] = {0,1,2,3,4,5,6,7,8};

    printf("--Welcome to a BomboClat Calculator--\n");
    while (true) {
        bool v = 0;
        printf("\n-Choose an Operation -\n1. SUM\n2. SUBTRACT\n3. MULTIPLICATION\n4. "
            "DIVISION \n5. POWER\n6. SQUARE\n7. SQUARE-ROOT\n8. LOGARITM\n0. STOP\nEnter(0-8): ");
        scanf("%d", &n);

        for (size_t i = 0; i < sizeof(op) / sizeof(op[0]); i++) {
            if (op[i] == n) v = 1;
        }
        
        if (v) {
            if (n == 0) break;
            else if (n == 6 || n == 7 || n == 8) {
                printf("Enter operand: ");
                scanf("%f", &a);
            }
            else {
                printf("Enter 1st operand: ");
                scanf("%f", &a);
                printf("Enter 2nd operand: ");
                scanf("%f", &b);
            }
            
        } else n = -1;

        switch (n) {
            case 1:
                res = sum(a, b);
                break;
            case 2:
                res = sub(a, b);
                break;
            case 3:
                res = mul(a, b);
                break;
            case 4:
                if (b != 0)
                    res = div(a, b);
                else {
                    printf("Zero Division is invalid;");
                    res = 0;
                }                printf("\nInvalid Opertor choose between (0 - 8)\n");

                break;
            case 5:
                res = pwr(a, b);
                break;
            case 6:
                res = sqr(a);
                break;
            case 7:
                res = sqt(a);
                break;
            case 8:
                res = lgr(a);
                break;
            default:
                printf("\nInvalid Opertor choose between (0 - 8)\n");
        
        }
        if (v) printf("\nResult: %.4f\n\n", res);
    }

  return 0;
}

/*
    int n = 0, m = 0;

    char cr [] = "vio";
    char sentence [] = "He a vaio";
    //                  012345678

    m = strcspn(sentence, cr);
    n = strspn(sentence, cr);

    printf("%d \n%d\n", m, n);
*/