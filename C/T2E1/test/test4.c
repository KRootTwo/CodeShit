#include <stddef.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int main() {
    
    char buffer[] = "ctrd sa9iu";
//                   0123456789

    size_t s1 = strspn(buffer, "ctre9");
    size_t s2 = strcspn(buffer, "9");

    printf("%lu\n%lu\n", s1, s2);
    
    return 0;
}