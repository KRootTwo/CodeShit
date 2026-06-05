#include <stdio.h>
#include <raylib.h>

int main () {
	
	const int height = 1080 / 2;
	const int width = 1980 / 2;
	const int fps = 60;
	const char* title = "Visca el Barca";

	InitWindow(width, height, title);
	SetTargetFPS(fps);

	while (!WindowShouldClose()) {
		BeginDrawing();
		ClearBackground(RAYWHITE);

		EndDrawing();

	}	
	
	CloseWindow();

	return 0;
}
