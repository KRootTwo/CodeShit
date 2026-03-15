#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>

#define mx_pdt 5

char shit[20];
char *p[mx_pdt][2];
typedef struct {
    int id[mx_pdt];
    char *pdt[mx_pdt];
    float price[mx_pdt];
} itemss ;

const char *items[mx_pdt][2] = {
    {"Octane Gel", "10/-"},
    {"Linc Executive Gel", "12/-"},
    {"Hauser Sonic Gel", "15/-"},
    {"Linc Glass Gel", "10/-"},
    {"Linc Ocean Gel", "10/-"}
};
void dispStore() {
    printf("| %s | %-18s | %6s |\n", "sl", "item name", "price");
    for (int i = 0; i < mx_pdt; i++) {
        printf("| %d  | %-18s | %6s |\n", i+1, items[i][0], items[i][1]);
    }
}
void purchase() {
    printf("Enter sl no. to purchase that pdt (0 to exit)\n");
    int i = -1, n = 0;
    while (true) {
        printf("sl: ");
        fgets(shit, sizeof(shit), stdin);
        sscanf(shit, "%d", &i);
        if (i == 0) break;

        printf("How many %s pens you wanna buy? ", items[i][0]);
    }
}

int main() {
    
    dispStore();
    
    return 0;
}