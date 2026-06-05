#include <stdio.h>
#include <stdbool.h>
#include <string.h>

struct Car {
    char name[50];
    int year;
    bool for_sale;
};
void dispC (struct Car *c) {
    printf("%s\n", c->name);
    printf("%d\n", c->year);
    if (c->for_sale == 0) printf("Not For Sale\n");
    else printf("For Sale\n");
    return;
}

int main() {
    
    struct Car l = {
        .name = "Lamborghini Lanzador",
        .year = 2020,
        .for_sale = false
    };
    struct Car d = {"Dodge Hellcat Redeye", 2020, true};

    dispC(&l);
    printf("\n");
    dispC(&d);
    
    return 0;
}