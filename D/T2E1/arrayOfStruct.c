#include <stddef.h>
#include <stdint.h>
#include <stdio.h>

// typedef char user[25];

typedef struct {
    char name[25];
    float gpa;
} Stud;

int main() {
    
    Stud s1 = {"Spongebob", 3.0};
    Stud s2 = {"Patrick", 2.5};
    Stud s3 = {"Sandy", 4.0};
    Stud s4 = {"Squidward", 5.0};

    Stud s[] = {s1, s2, s3, s4};

    for (size_t i = 0; i < sizeof(s)/sizeof(s[0]); i++) {
        printf("%-10s\t", s[i].name);
        printf("%.1f\n", s[i].gpa);
    }
    
    return 0;
}