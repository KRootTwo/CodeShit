#include <stdio.h> // standard input-output header file
#include <stdbool.h> // standard boolean header file

int main() {
    
    printf("Sup World!\n");

    int a = 2;
    float b = 5.2;
    double c = 7.567;
    char d = '!';
    char e [] = "Bitch";
    bool f = true;
    bool g = 1;
    bool h = 0;

    
    printf("Shitter %d\n", a);
    printf("Shitter %d\n", -a);
    printf("Shitter %f\n", b);
    printf("Shitter %.1f\n", b);
    printf("Shitter %lf\n", c);
    printf("Shitter %.4lf\n", c);
    printf("Shitter %c\n", d);
    printf("Shitter %s\n", e);
    printf("Shitter %d\n", f);
    printf("Shitter %d\n", g);
    printf("Shitter %d\n", h);
    printf("Shitter \b%d\n", h);
    printf("%d\n", a);

    if (f)
        printf("Bitch Nigga.\n");
    else {
        printf("Fuck Nigga.\n");
    }
    
    return 0;
}

/*

variables - reuseable containers
int - whole number (4 bytes)
float - single precision decimal number (4 bytes)
double - double precision decimal number (8 bytes)
char - single character (1 byte)
char [] - array of characters (size varies)
bool - true or false (1 byte, requires <stdbool.h>)


*/