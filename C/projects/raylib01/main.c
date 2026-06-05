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

#define BOARD_SIZE 8
#define TILE_SIZE 42
#define TILE_TYPES 5

const char tile_sym[TILE_TYPES] = {'@', '$', '&', '#', '%'};
char TILE_S[BOARD_SIZE][BOARD_SIZE];

char rand_tile() {
    return tile_sym[random() % TILE_TYPES];
}
void init_board() {
    for (u8 i = 0; i < BOARD_SIZE; i++) {
        for (u8 j = 0; j < BOARD_SIZE; j++) {
            TILE_S[i][j] = rand_tile();
        }
    }
}

int main() {
    
    const int screen_width = 800;
    const int screen_height = 450;

    InitWindow(screen_width, screen_height, "FYTFN");
    SetTargetFPS(60);

    init_board();

    while (!WindowShouldClose()) {



        BeginDrawing();
        ClearBackground(BLACK);

        EndDrawing();
    }



    CloseWindow();    
    return 0;
}