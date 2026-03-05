#include <stdio.h>
#include <string.h>

int main() {

    char s[] = {'H', 'O', 'B', 'B', 'I', 'T', 0};
    char u[] = "HOBBIT";
    char *x = "Te Fuk";

    if (strcmp(s, u)) {
        printf("yay\n");
    } else {
        printf("nay\n");
    }

    printf("%s\n", s);
    printf("%s\n", x);

    return 0;
}