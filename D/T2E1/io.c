#include <stdio.h>
#include <stdbool.h>
#include <stddef.h>

int main() {
    char shit[100];

    FILE *fp = fopen("blehh.txt", "r+");
    if (fp == NULL) {
        printf("File failed to open");
        return 1;
    }
    fprintf(fp, "Hello Biyachhh\n");
    fprintf(fp, "Number: %d\n", 67);
    
    rewind(fp);

    while (fgets(shit, sizeof(shit), fp) != NULL) {
        printf("%s", shit);
    }
    
    fclose(fp);
    return 0;
}



// | Mode   | Meaning                  |
// | ------ | ------------------------ |
// | `"r"`  | read                     |
// | `"w"`  | write (overwrite)        |
// | `"a"`  | append                   |
// | `"r+"` | read + write             |
// | `"w+"` | read + write (overwrite) |
// | `"a+"` | read + append            |
