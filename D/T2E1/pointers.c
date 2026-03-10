#include <stdio.h>
#include <stdbool.h>
#include <string.h>

struct Car {
    char name[50];
    int year;
    bool forSale;
};
void init(struct Car *p) {
    strcpy(p->name, "Toyota GR-GT");
    p->year = 2026;
    p->forSale = false;
    return;
}
int main() {

    struct Car t;
    init(&t);
    printf("%s\n", t.name);
    printf("%d\n", t.year);
    printf("%d\n", t.forSale);
    
    return 0;
}