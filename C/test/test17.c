#include <stdio.h>
#include <stdlib.h>

#define MAX 5

int isEmpty();
int isFull();
void enqueue(int x);
void dequeue();
void display();

int Queue[MAX];
int front = -1;
int rear = -1;

int main() {
    int choice, x;

    do {
        printf("\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Display\n");
        printf("4. Quit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                if (isFull()) {
                    printf("Queue Overflow! enqueue operation can't be performed.\n");
                } else {
                    printf("Enter the element to be enqueued: ");
                    scanf("%d", &x);
                    enqueue(x);
                }
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                printf("Quiting.\n");
                break;
            default:
                printf("Wrong choice, try again.\n");
        }
    } while (choice != 4);

    return 0;
}

int isFull() {
    if (rear == MAX - 1) {
        return 1;
    }
    return 0;
}

int isEmpty() {
    if (front == -1 || front > rear) {
        return 1;
    }
    return 0;
}

void enqueue(int x) {
    if (front == -1) {
        front = 0;
    }
    rear = rear + 1;
    Queue[rear] = x;
    printf("%d enqueued successfully.\n", x);
}

void dequeue() {
    if (isEmpty()) {
        printf("Queue Underflow! Dequeue operation can't be performed.\n");
    } else {
        printf("Dequeued element is: %d\n", Queue[front]);
        front = front + 1;
    }
}

void display() {
    int i;
    if (isEmpty()) {
        printf("Queue is empty.\n");
    } else {
        printf("Queue elements:\n");
        for (i = front; i <= rear; i++) {
            printf("%d ", Queue[i]);
        }
        printf("\n");
    }
}
