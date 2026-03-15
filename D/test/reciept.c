#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>

int main() {
    char shit[100];

    FILE *fp = fopen("reciept1.txt", "w+");
    if (fp == NULL) {
        printf("Failed to open file nigga\n");
        return 1;
    }
    fprintf(fp, "Visca Barca Visca Catlunya\n");
    fprintf(fp, "puta Madrid\n");

    rewind(fp);

    while (fgets(shit, sizeof(shit), fp) != NULL) {
        printf("%s", shit);
    }

    
    return 0;
}