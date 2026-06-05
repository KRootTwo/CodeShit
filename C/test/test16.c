#include <stdio.h>
#include <unistd.h>
#define bar_len 30

void update_progress_bar(int line_no, int percent) {
    printf("\033[%d;0H", line_no);
    printf("\033[K");

    int ch_cnt = (percent / 100.0f) * bar_len;

    printf("[\033[38;5;202m");
    for (int i = 0; i < ch_cnt; i++) {
        printf("#");
    }
    printf("\033[38;5;18m");
    for (int i = 0; i < bar_len - ch_cnt; i++) {
        printf("-");
    }
    printf("\033[0m] %d%%" , percent);
    if (percent <= 0) printf(" (\033[31mNot Started\033[0m)");
    else if (percent >= 100) printf(" (\033[38;5;81mFinished\033[0m)");
    else printf(" (\033[38;5;40mReading\033[0m)");

    fflush(stdout);
}

int main() {

    printf("\033[2J");

    printf("1. The Hobbit\n");
    printf("J.R.R. Tolkein\n");
    printf("fantasy\n");
    printf("hobbit\n\n");

    printf("Progress - 389/389\n\n");

    printf("\nStart  - 2026-01-05\n");
    printf("Finish - 2026-05-10\n");
    printf("Spent on book: 3 months 23 days\n");
    printf("Rating - EPIC\n\n");
    /////////////////////////////////////////////////////////
    printf("2. Notes From The Underground and The Double\n");
    printf("Fyodor Mikhaylovich Dostoyevsky\n");
    printf("fiction\n");
    printf("nofu\n\n");

    printf("Progress - 10/282\n\n");

    printf("\nStart  - 2026-04-05\n");
    printf("Spent on book: 23 days 0 hours 0 minutes\n");

    for (int i = 0; i <= 100; i++) {
        update_progress_bar(7, i);
        update_progress_bar(20, i/10);
        usleep(25000);
    }

    printf("\033[4B\n");

    return 0;
}