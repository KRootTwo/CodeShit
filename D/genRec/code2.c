#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>

int l = 0;
typedef struct {
    int id;
    char *name;
    float price;
} items;
void dispStore(items *j) {
    printf("| %s | %-18s | %6s |\n", "sl", "item name", "price");
    for (int i = 0; i < l; i++) {
        printf("| %d  | %-18s | %6.2f |\n", i+1, j[i].name, j[i].price);
    }
}
int main() {
    char line[100];
    int n = 0;

    // init fp
    FILE *fp = fopen("/home/ktv/CodeShit/D/genRec/items.csv", "r");
    if (fp == NULL) {
        printf("Error opening file nigga\n");
        return 1;
    }

    // getting no. of items
    while (fgets(line, sizeof(line), fp) != NULL) {
        l++;
    }

    // rewind that bitch
    rewind(fp);

    // dma & init
    items *i = malloc(sizeof(items) * l);
    while (fgets(line, sizeof(line), fp)) {
        i[n].id = atoi(strtok(line, ","));

        char *name = strtok(NULL, ",");
        i[n].name = malloc(strlen(name) + 1);
        strcpy(i[n].name, name);

        i[n].price = atof(strtok(NULL, ","));
        n++;
    }

    // display
    dispStore(i);

    // free
    for (int k = 0; k < l; k++) {
        free(i[k].name);
    }
    free(i);
    i = NULL;
    return 0;
}