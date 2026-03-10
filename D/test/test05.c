#include <linux/limits.h>
#include <stdio.h>

struct Employee {
    char name[10];
    int age;
};

int main() {
    
    struct Employee emp = {
        "Steve",
        50
    };
    
    printf("%s, aged %d years\n", emp.name, emp.age);
    
    return 0;
}