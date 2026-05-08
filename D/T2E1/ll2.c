#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>
#include <time.h>
#include <unistd.h>

typedef struct node_t {
    int data;
    struct node_t *prev;
    struct node_t *next;
} node_t;
typedef struct {
    node_t *head;
    node_t *tail;
    size_t size;
} linked_list;

node_t* create_node (int val) {
    node_t *nh = malloc(sizeof(*nh));

    if (nh == NULL) {
        printf("DMA failed");
        exit(1);
    }
    
    nh->data = val;
    nh->prev = NULL;
    nh->next = NULL;

    return nh;
}

void push_back (linked_list *list, int val) {
    node_t *n = create_node(val);

    if (list->tail == NULL) {
        list->head = list->tail = n;
    }
    else {
        n->prev = list->tail;
        list->tail->next = n;
        list->tail = n;
    }
    list->size++;
}
void show_list (linked_list *list) {
    node_t *n = list->head;

    while (n != NULL) {
        printf("%d", n->data);

        if (n->next != NULL) {
            printf(" -> ");
        }
        n = n->next;
    }
    printf("\n");
    free(n);
}


int main() {
    
    linked_list *list = calloc(1, sizeof(*list));

    push_back(list, 67);
    push_back(list, 69);

    show_list(list);

    
    return 0;
}

/*
    // linked_list *list = malloc(sizeof(*list));
    // list->head = NULL;
    // list->tail = NULL;
    // list->size = 0;
*/