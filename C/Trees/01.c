#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>
#include <ctype.h>
#include <sys/types.h>
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

/* Structs */
typedef struct Node {
    struct Node *l;
    struct Node *r;
    i64 v;
} Node;

typedef struct bTree {
    Node *h;
} bTree;

/* Methods */
static Node* inorder(i64 a[], u64 i, u64 len) {
    if (i > len) return NULL;

    Node* n = (Node*) malloc(sizeof(Node));

    n->v = *(a + i);
    n->l = inorder(a, 2 * i + 1, len);
    n->r = inorder(a, 2 * i + 2, len);

    return n;
}
bTree fill(bTree t, i64 a[], u64 len) {
    if (len <= 0) return t;

    t.h = inorder(a, 0, len);
    return t;
}
/*-------------------------***--------------------------*/

bTree fillN(bTree t, i64 a[], u64 len) {
    if (len <= 0) return t;
    
    Node* n[len];

    for (u64 i = 0; i < len; i++) {
        n[i] = (Node*) malloc(sizeof(Node));
        n[i]->v = a[i];
        n[i]->l = NULL;
        n[i]->r = NULL;
    }

    for (u64 i = 0; i < len; i++) {
        i64 li = 2 * i + 1;
        i64 ri = 2 * i + 2;
        
        if (li < len) n[i]->l = n[li];
        if (ri < len) n[i]->r = n[ri];
    }

    t.h = n[0];
    return t;
}


int main() {
    
    bTree *t = NULL;

    
    return 0;
}