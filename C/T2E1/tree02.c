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
    int val;
    struct Node* left;
    struct Node* right;
} Node;

typedef struct bin_tree {
    struct Node* root;
} bin_tree;

static void read_l (char *buffer, u32 size) {
    if (fgets(buffer, size, stdin))  {
        buffer[strcspn(buffer, "\n")] = '\0';
    }
}

void populate_p (Node** root) {
    
}

void populate (Node** root) {
    char buff[128];
    printf("Enter val: ");
    int dat;
    read_l(buff, sizeof(buff));
    sscanf(buff, "%d", &dat);
    (*root)->val = dat;

    populate_p (root);
}



int main() {
    
    bin_tree* bt = (bin_tree*)calloc(1, sizeof(bin_tree));

    
    return 0;
}