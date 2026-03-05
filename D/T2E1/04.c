#include <stdio.h>
#include <stdbool.h>

#define max_employee 100
#define max_id 32

struct emp {
    int id;
    char fn[64];
    char ln[64];
    float income;
    bool ismanager;
};

int main () {

    struct emp emps[max_employee];

    for (int i = 0; i < max_employee; i++) {
    }

    return 0;
}