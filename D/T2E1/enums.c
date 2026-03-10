#include <stdio.h>

// enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat};
//          1    2    3    4    5    6    7

enum Day {Sun = 1, Mon = 2, Tue = 3, Wed = 4, Thu = 5, Fri = 6, Sat = 7};

int main() {
    
    enum Day t = Sun;  // enums ain't strings
    printf("%d\n", t);
    
    return 0;
}