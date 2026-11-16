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


int main() {
    
    int a[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    for (size_t i = 0; i < 10; i++) {
        printf("%d\n", *(a + i));
    }
    
    return 0;
}