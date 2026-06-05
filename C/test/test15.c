#include <stdio.h>
#include <unistd.h>

void update_bar(int line, int percent, int bar_num) {
    // Move to specific line (1-indexed from top)
    printf("\033[%d;0H", line);  // Move to line X, column 0
    printf("\033[K");              // Clear the line
    
    // Draw your bar
    int bar_len = 30;
    int chars = (percent / 100.0f) * bar_len;
    
    printf("Progress %d: [", bar_num);
    for (int i = 0; i < chars; i++) printf("#");
    for (int i = 0; i < bar_len - chars; i++) printf("-");
    printf("] %3d%%", percent);
    
    fflush(stdout);
}

int main() {
    // Step 1: Print ALL static content immediately
    printf("=== System Update ===\n");
    printf("Downloading packages...\n\n");    // Bar 1 will go here
    printf("Installing packages...\n\n");     // Bar 2 will go here
    printf("Verifying checksums...\n");
    printf("====================\n");
    
    // Step 2: Animate multiple bars
    // Bar 1 at line 3, Bar 2 at line 5
    for (int progress = 0; progress <= 100; progress++) {
        update_bar(3, progress, 1);      // Update bar 1 at line 3
        update_bar(5, progress / 2, 2);  // Update bar 2 at line 5 (slower)
        usleep(50000);
    }
    
    printf("\n\033[2B");  // Move down 2 lines after completion
    printf("Done!\n");
    
    return 0;
}

/*
\033[line;  colH	Move cursor to specific line and column (1-indexed)
\033[line;  colf	Same as H (alternative)
\033[nA	    Move up n lines (relative)
\033[nB	    Move down n lines (relative)
\033[K	    Clear from cursor to end of line
*/