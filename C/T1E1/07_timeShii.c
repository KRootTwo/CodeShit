#include <stdio.h>
#include <time.h>


void cTime();
void dte();

int main() {

    cTime();
    

    return 0;
}

void cTime() {
    time_t now = time(NULL);
    printf("%ld\n", now);
}