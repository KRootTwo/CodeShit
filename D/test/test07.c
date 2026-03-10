#include <math.h>
#include <stddef.h>
#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

char shit[50];

struct student {
    char name[50];
    int id;
    float grade;
};
void init_stud (struct student *s) {

    printf("Entre name: ");
    fgets(s->name, sizeof(s->name), stdin);
    s->name[strcspn(s->name, "\n")] = '\0';

    printf("Entre grade: ");
    fgets(shit, sizeof(shit), stdin);
    sscanf(shit, "%f", &s->grade);

    printf("Entre id: ");
    fgets(shit, sizeof(shit), stdin);
    sscanf(shit, "%d", &s->id);

}
void prnt_stud (struct student *s) {
    printf("%s\n", s->name);
    printf("%d\n", s->id);
    printf("%.2f\n", s->grade);
}

int main() {
    size_t n;
    printf("Entre size: ");
    fgets(shit, sizeof(shit), stdin);
    sscanf(shit, "%zu", &n);

    if (n <= 0) {
        printf("Invalid size\n");
        return 1;
    }

    struct student *s = malloc(sizeof(struct student) * n);

    for (size_t i = 0; i < n; i++) {
        init_stud(&s[i]);
    }
    
    for (size_t i = 0; i < n; i++) {
        prnt_stud(&s[i]);
    }
    
    free(s);
    s = NULL;
    return 0;
}



// char buf[100];

// printf("Enter name id grade: ");
// fgets(buf, sizeof(buf), stdin);

// sscanf(buf, "%49[^0-9\n] %d %f", s->name, &s->id, &s->grade);
// if (sscanf(buf, "%49s %d %f", s->name, &s->id, &s->grade) != 3) {
//     printf("Invalid input\n");
// }