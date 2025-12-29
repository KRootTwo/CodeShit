#include <stdio.h>

const float PI = 3.14;   // global const
int add;                 // global variable

void sum(int, int);      // global function
int fact(int);
void toOne(int);
int sumn(int);
int sumn2(int);

int main () {
    // sum(4, 5);
    // sum(3, 4);
    // printf("addition: %d\n", add);

    // int o = fact(9);
    // printf("factorial: %d\n", o);
    // toOne(10);
    int d = sumn2(9);
    printf("%d\n", d);
    return 0;
}

int fact(int a) {
    if (a == 0) return 1;
    return a * fact(a - 1);
}
void toOne(int a) {
    if (a <= 0) return;
    printf("%d\t", a);
    toOne(a - 1);
}
int sumn(int n) {
    if (n <= 0)
        return 0;
    return n + sumn(n - 1);
}
int sumn2(int n) {
    if (n <= 0)
        return 0;
    return n + sumn2(n - 2);
}
void sum(int a, int b) {
    add = a + b;
}





/*
We defining the functions under main. We can do this cuz we declared them over main. If u remove that shitter gcc's gonna crash out.
*/