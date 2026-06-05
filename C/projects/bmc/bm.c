#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>
#include <ctype.h>
#include <time.h>
#include <unistd.h>
#include <stdint.h>

#define csv_file "/home/ktv/C Projects/Bookmark/Data/db.csv"
#define temp_file "/home/ktv/C Projects/Bookmark/Data/temp.csv"
#define bar_len 30

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
typedef enum {
    action, non_fiction, fiction, fantasy, self_help, horror, drama, 
    history, sci_fi, mystery, crime, thriller, suspense, romance, 
    literary_fiction, autobiography, memoir, biography, poetry, comics
} Category;
typedef enum {
    epic, awesome, good, mid, bad, horrendous, dogshite, null
} Rating;
typedef struct{
    int sl_no;
    char* book_name;
    char* author;
    Category category;
    char* book_id;
    int total_pages;
    long long start_date;
    int current_page;
    bool isFinished;
    bool isDeleted;
    long long finish_date;
    Rating rating;
} Book;

//-----------------------helper functions---------------------------
void to_lower_inplace(char *str);
char* to_lower(char *str);
char* to_upper(const char *str);
long get_today_long_date ();
void show_date_string (long l);
time_t long_date_to_unix (long l);
void compare_time(long t1, long t2);
void clear_screen();















int main() {
    
    
    
    return 0;
}