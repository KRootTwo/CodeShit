#include <stdio.h>

int main() {
    
    // int x;
    // char x;
    // float x;
    char x[10];

    printf("Entre sumn: ");
    // printf("%d\n", scanf("%s", &x));
    printf("%d\n", scanf("%9[a-z]s", x));
    
    printf("%s\n", x);
    
    return 0;
}


/*
segfault experiment


printf("%d\n", scanf("%9s", &x));




*/