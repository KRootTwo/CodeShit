#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>
#include <ctype.h>
#include <time.h>
#include <unistd.h>

typedef struct Node {
    int data;
    struct Node *next;
} Node;

int main() {
    
    Node *head = NULL;
    Node *second = NULL;
    Node *third = NULL;

    head = (Node *)malloc(sizeof(Node));
    second = (Node *)malloc(sizeof(Node));
    third = (Node *)malloc(sizeof(Node));

    if (head == NULL || second == NULL || third == NULL) {
        printf("Malloc failed");
        return 1;
    }

    head->data = 10;
    head->next = second;

    second->data = 20;
    second->next = third;

    third->data = 30;
    third->next = NULL;

    Node *temp = head;
    while (temp != NULL) {
        printf("%d\n", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
    
    temp = head;
    while (temp != NULL) {
        Node *next = temp->next;
        free(temp);
        temp = next;
    }
    return 0;
}