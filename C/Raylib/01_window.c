#include <stdio.h>
#include <raylib.h>

int main() {
    
    const int screen_height = 1080 / 2;
    const int screen_width = 1980 / 2;
    const char* title = "sup fuck NIGGA";
    const int fps = 60;

    // Window initialization
    InitWindow(screen_width, screen_height, title);
    
    // Set FPS
    SetTargetFPS(fps);
    
    // Stop condition
    while (!WindowShouldClose()) {
        // Begin drawing window
        BeginDrawing();

        // Set background color
        ClearBackground(RAYWHITE);

        // End drawing
        EndDrawing();

    }

    // Close
    CloseWindow();

    return 0;
}