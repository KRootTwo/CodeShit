#include <stdio.h>

int main() {

    char z[10];
    char i;
    // char *j;

    printf("Enter a character: ");
    fgets(z, sizeof(z), stdin);
    sscanf(z, "%c", &i);

    printf("Entered character: %c\n", i);

    return 0;
}

/**
 * 
char temp;
char *j = &temp;

sscanf(z, "%c", j);
printf("%c", *j);

 * 
 */