#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>
#include <time.h>
#include <unistd.h>
#include <stdint.h>

typedef int8_t i8;
typedef int16_t i16;
typedef int32_t i32;
typedef int64_t i64;
typedef uint8_t u8;
typedef uint16_t u16;
typedef uint32_t u32;
typedef uint64_t u64;
typedef i8 b8;
typedef i32 b32;
typedef float f32;
typedef double f64;

typedef struct Node {
    i32 val;
    struct Node* left;
    struct Node* right;
} Node;
typedef struct BinTree {
    Node* root;
} BinTree;

static void read_l (char *buffer, size_t size) {
    if (fgets(buffer, size, stdin)){
        buffer[0] = '\0';   
    }
}

void populate_p (Node **root) {
    bool lft = 0, rgt = 0;
    char buffer[128];

    printf("Do you want to enter left of %d? (y/n): ", (*root)->val);
    char c = getchar();
    lft = (c == 'y' || c == 'Y')? 1 : 0;

    if (lft) {
        printf("Enter val: ");
        i32 v;
        read_l(buffer, sizeof(buffer));
        sscanf(buffer, "%d", &v);

        Node *new = (Node *) calloc(1, sizeof(Node));
        new->val = v;
        (*root)->left = new;
        populate_p(&(*root)->left);
    }

    
    printf("Do you want to enter right of %d? (y/n): ", (*root)->val);
    char d = getchar();
    rgt = (d == 'y' || d == 'Y') ? 1 : 0;

    if (rgt) {
        printf("Enter val: ");
        i32 v;
        read_l(buffer, sizeof(buffer));
        sscanf(buffer, "%d", &v);
        
        Node *new = (Node *)calloc(1, sizeof(Node));
        new->val = v;
        (*root)->right = new;
        populate_p(&(*root)->right);
    }

}
void populate (Node **root) {
    char buffer[128];

    printf("Enter val: ");
    i32 data;
    read_l(buffer, sizeof(buffer));
    sscanf(buffer, "%d", &data);
    (*root)->val = data;

    populate_p(root);
}

int main () {
    
    BinTree *bt = (BinTree*)calloc(1, sizeof(BinTree));

    if (bt == NULL) {
        printf("Failed malloc");
        return 1;
    }

    bt->root = (Node *)calloc(1, sizeof(Node));



    free(bt);
    return 0;
}

    