#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>
#include <ctype.h>
#include <time.h>
#include <unistd.h>
#include <stdint.h>
typedef int8_t i8;
typedef int16_t i16;
typedef int32_t i32;
typedef int64_t i64;
typedef uint8_t u8;
typedef uint16_t u16;
typedef uint32_t u32;
typedef uint64_t u64;
typedef i8 b8;
typedef i32 b32;
typedef float f32;
typedef double f64;

bool even (int x) {
    return x % 2 == 0;
}
void print_if (int xs[10], bool (*iff) (int)) {
    for (int i = 0; i < 10; i++) {
        if (iff(xs[i])) {
            printf("%d\n", xs[i]);
        }
    }
}
int compar (const void *x1, const void *x2) {
    return (*(int *)x1, *(int *)x2);
}

int main() {
    
    int xs[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    print_if(xs, even);
    
    
    
    return 0;
}