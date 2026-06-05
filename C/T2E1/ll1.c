#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <stddef.h>
#include <unistd.h>

typedef struct node_t {
    struct node_t *prev;
    int data;
    struct node_t *next;
} node_t;

void show_nodes(node_t *head) {
    node_t *temp = head;
    while (temp != NULL) {
        printf("%d", temp->data);

        if (temp->next != NULL) {
            printf(" -> ");
        }

        temp = temp->next;
    }
    free(temp);
    printf("\n");
}


int main() {
    
    node_t *n1 = (node_t *)malloc(sizeof(*n1));
    n1->prev = NULL;
    n1->data = 67;
    n1->next = NULL;

    node_t *n2 = (node_t *)malloc(sizeof(node_t));
    n2->prev = NULL;
    n2->data = 69;
    n2->next = NULL;
    n1->next = n2;

    show_nodes(n1);
    
    free(n1);
    return 0;
}