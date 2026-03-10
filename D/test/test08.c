#include <stddef.h>
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

#define max_stud 20
static unsigned int stud_count = 0;

__attribute__((__packed__)) struct student {
    char *name;
    unsigned int id;
    float grade;
};
void init_stud(struct student *s) {
    char shit[50];
    printf("\nStudent %d\n", ++stud_count);
    char k[101];
    printf("Enter name: ");
    fgets(k, sizeof(k), stdin);
    k[strcspn(k, "\n")] = '\0';
    s->name = malloc(strlen(k) + 1);
    strcpy(s->name, k);

    printf("Enter id and grade: ");
    fgets(shit, sizeof(shit), stdin);
    if (sscanf(shit, "%u %f", &s->id, &s->grade) != 2) {
        printf("Invalid input");
    }
};
void show_stud(struct student *s) {
    printf("Name: %s\nID: %u\nGrade: %.2f\n", s->name, s->id, s->grade);
};
struct student* find_stud(struct student *s, size_t t,unsigned int id) {
    for (size_t i = 0; i < t; i++) {
        if (s[i].id == id) {
            return &s[i];
        }
    }
    return NULL;
};
void curve_grades(struct student *s, size_t n, float amount) {
    for (size_t i = 0; i < n; i++) {
        s[i].grade += amount;
    }
};
struct student* best_student(struct student *s, size_t n) {
    struct student *b = &s[0];
    for (size_t i = 1; i < n; i++) {
        if (s[i].grade > b->grade)
            b = &s[i];
    }
    return b;
};

int main () {
    char shit[50];
    int n;

    printf("Enter number of students: ");
    fgets(shit, sizeof(shit), stdin);
    sscanf(shit, "%d", &n);
    if (n < 0 || n > 20) {
        printf("Invalid input");
        return -1;
    }

    struct student *s = malloc(sizeof(struct student) * n);

    for (int i = 0; i < n; i++) {
        init_stud(&s[i]);
    }
    printf("\nStudent Count: %d\n", stud_count);
    for (int i = 0; i < n; i++) {
        show_stud(&s[i]);
    }

    printf("\nWanna find a Student(y/n)?");
    char c;
    fgets(shit, sizeof(shit), stdin);
    c = shit[0];
    if (c != 'n' && c != 'N') {
        unsigned int id;
        printf("\nEnter student ID: ");
        fgets(shit, sizeof(shit), stdin);
        sscanf(shit, "%u", &id);
        struct student *p = find_stud(s, n, id);
        if (p != NULL) {
            show_stud(p);
        } else {
            printf("Invalid input\n");
        }
    }
    printf("\nWanna curve grades?(y/n)?");
    fgets(shit, sizeof(shit), stdin);
    c= shit[0];
    if (c != 'n' && c != 'N') {
        float amt;
        printf("\nEnter curve amount: ");
        fgets(shit, sizeof(shit), stdin);
        sscanf(shit, "%f", &amt);
        curve_grades(s, n, amt);
    }
    for (int i = 0; i < n; i++) {
        show_stud(&s[i]);
    }

    for (int i = 0; i < n; i++) {
        free(s[i].name);
    }
    free(s);
    s = NULL;

    return 0;
}