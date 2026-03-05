#include <stdio.h>

int main(int argc, char *argv[]) {
    if (argc == 2) {
        int i = 0;
        while (i < 5) {
            printf("%s\n", argv[1]);
            i++;
        }
    }

    return 0;
}