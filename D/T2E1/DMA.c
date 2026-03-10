#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

#define max_e 10

struct eazy {
    char name[50];
    int ID;
    bool is_pussy;
};
int init_e (struct eazy *e) {
    static int num_e = 0;
    num_e++;

    strcpy(e->name, "Flick");
    e->ID = 9800;
    e->is_pussy = false;

    return num_e;
}
void dispC (struct eazy *c) {
    printf("%s\n", c->name);
    printf("%d\n", c->ID);
    if (c->is_pussy == 0) printf("Not A Pussy\n");
    else printf("Pure Cunt\n");
    return;
}


int main() {
    char shit[50];

    int n;
    printf("Entre size: ");
    fgets(shit, sizeof(shit), stdin);
    sscanf(shit, "%d", &n);

    struct eazy *e = malloc(sizeof(struct eazy) * n);

    if (e == NULL) {
        printf("The allocator failed\n");
        return -1;
    } else if (n <= 0 || n > max_e) {
        printf("Invalid size\n");
    return 1;
    }

    for (int i = 0; i < n; i++) {
        int d = init_e(&e[i]);
        printf("Employee ID: %d\n", d);
    }
    for (int i = 0; i < n; i++) {
    dispC(&e[i]);
    }

    free(e);
    e = NULL;
    
    return 0;
}




    // struct eazy e = {"Lewandowski", 8900, false};
    // struct eazy n = {
    //     .name = "Vini Jr.",
    //     .ID = 6769,
    //     .is_pussy = true
    // };
    