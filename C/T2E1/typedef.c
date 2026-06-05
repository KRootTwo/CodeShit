#include <stdio.h>

// typedef char user[25];

typedef struct {
    char name[25];
    char pass[12];
    int id;
} User;

int main() {
    
    // user user1 = "bruhh";
    User u1 = {"bruhh", "asgfugeyv", 34};
    User u2 = {"blehh", "ksdnugeyv", 43};

    printf("%s\n", u1.name);
    printf("%s\n", u2.name);


    
    return 0;
}