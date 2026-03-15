#include <stdlib.h>
#include <stddef.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

char* revCArr (char s[], size_t z) {
    char *r = malloc(z + 1);
    for (size_t i = 0; i < z; i++) {
        r[i] = s[z - i - 1];
    }
    r[z] = '\0';
    return r;
}
bool palin(char s[], size_t z) {
    char *r = revCArr(s, z);
    for (size_t i = 0; i < z; i++) {
        if (s[i] != r[i]) {
            return 0;
        }
    }
    return 1;
}
int main() {
    
    char s[] = "niggin";
    char *rev = revCArr(s, strlen(s));
    printf("%s\n%s\n", s, rev);

    bool b = palin(s, strlen(s));
    printf("%d\n", b);


    free(rev);
    rev = NULL;
    return 0;
}