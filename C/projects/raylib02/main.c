#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>
#include <ctype.h>
#include <time.h>
#include <unistd.h>
#include <stdint.h>
#include <raylib.h>

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
    
    const i16 screen_width = 800;
    const i16 screen_height = 450;

    InitWindow(screen_width, screen_height, "Raylib demo");
    SetTargetFPS(60);

    while (!WindowShouldClose()) {

        BeginDrawing();
        ClearBackground(RED);
        DrawRectangle(100, 200, 40, 60, BLACK);

        EndDrawing();

    }
    
    CloseWindow();
    return 0;
}