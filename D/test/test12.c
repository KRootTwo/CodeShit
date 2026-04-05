#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <stddef.h>

long get_today_long_date () {
    time_t now = time(NULL);
    struct tm *t = localtime(&now);

    long d = (t->tm_year + 1900) * 10000 +
             (t->tm_mon + 1) * 100 +
             (t->tm_mday);
    return d;
}
void show_date_string (long l) {
    int year, month, day;

    day = l % 100;
    l /= 100;
    month = l % 100;
    l /= 100;
    year = l;
    
    printf("%04d-%02d-%02d\n", year, month, day);
}
time_t long_date_to_unix (long l) {
    struct tm *t = {0};

    t->tm_mday = l % 100;
    l /= 100;
    t->tm_mon = l % 100;
    l /= 100;
    t->tm_year = l;

    return mktime(t);
}
void compare_time(long t1, long t2) {
    time_t t3 = long_date_to_unix(t1);
    time_t t4 = long_date_to_unix(t2);

    time_t diff = (t3 > t4) ? (t3 - t4) : (t4 - t3);

    int days = diff / (60 * 60 * 24);
    int years = days / 365;
    days %= 365;
    int months = days / 30;
    days %= 30;
    int hours = (diff / (60 * 60)) % 24;
    int minutes = (diff / 60) % 60;

    if (years != 0) {
        printf("%d years %d months %d days\n", years, months, days);
    } 
    else if (months != 0) {
        printf("%d months %d days\n", months, days);
    } 
    else {
        printf("%d days %d hours %d minutes\n", days, hours, minutes);
    }
}
int main() {

    time_t now = time(NULL);
    printf("Unix Time - %ld\n", now);

    struct tm *time = localtime(&now); 
    printf("Current date - %02d-%02d-%d\n", time->tm_mday, time->tm_mon + 1, time->tm_year + 1900);

    printf("%ld\n", get_today_long_date());
    show_date_string(get_today_long_date());

    return 0;
}
