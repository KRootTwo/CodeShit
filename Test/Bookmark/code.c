#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>
#include <ctype.h>
#include <time.h>
#include <unistd.h>

#define csv_file "/home/ktv/CodeShit/Test/Bookmark/Data/db.csv"
#define temp_file "/home/ktv/CodeShit/Test/Bookmark/Data/temp.csv"
#define bar_len 30

// enums
typedef enum {
    action, non_fiction, fiction, fantasy, self_help, horror, drama, 
    history, sci_fi, mystery, crime, thriller, suspense, romance, 
    literary_fiction, autobiography, memoir, biography, poetry, comics
} Category;
typedef enum {
    epic, awesome, good, mid, bad, horrendous, dogshite, null
} Rating;

// enum functions
Category get_category(const char* str) {
    if (strcmp(str, "action") == 0) return action;
    if (strcmp(str, "non fiction") == 0) return non_fiction;
    if (strcmp(str, "fiction") == 0) return fiction;
    if (strcmp(str, "fantasy") == 0) return fantasy;
    if (strcmp(str, "self help") == 0) return self_help;
    if (strcmp(str, "horror") == 0) return horror;
    if (strcmp(str, "drama") == 0) return drama;
    if (strcmp(str, "history") == 0) return history;
    if (strcmp(str, "sci fi") == 0) return sci_fi;
    if (strcmp(str, "mystery") == 0) return mystery;
    if (strcmp(str, "crime") == 0) return crime;
    if (strcmp(str, "thriller") == 0) return thriller;
    if (strcmp(str, "suspense") == 0) return suspense;
    if (strcmp(str, "romance") == 0) return romance;
    if (strcmp(str, "literary fiction") == 0) return literary_fiction;
    if (strcmp(str, "autobiography") == 0) return autobiography;
    if (strcmp(str, "memoir") == 0) return memoir;
    if (strcmp(str, "biography") == 0) return biography;
    if (strcmp(str, "poetry") == 0) return poetry;
    if (strcmp(str, "comics") == 0) return comics;
    return fiction;
}
const char* category_to_string(Category c) {
    switch (c) {
        case action: return "action";
        case non_fiction: return "non_fiction";
        case fiction: return "fiction";
        case fantasy: return "fantasy";
        case self_help: return "self_help";
        case horror: return "horror";
        case drama: return "drama";
        case history: return "history";
        case sci_fi: return "sci_fi";
        case mystery: return "mystery";
        case crime: return "crime";
        case thriller: return "thriller";
        case suspense: return "suspense";
        case romance: return "romance";
        case literary_fiction: return "literary_fiction";
        case autobiography: return "autobiography";
        case memoir: return "memoir";
        case biography: return "biography";
        case poetry: return "poetry";
        case comics: return "comics";
        default: return "non_fiction";
    }
}
Rating get_rating(const char* str) {
    if (strcmp(str, "epic") == 0) return epic;
    if (strcmp(str, "awesome") == 0) return awesome;
    if (strcmp(str, "good") == 0) return good;
    if (strcmp(str, "mid") == 0) return mid;
    if (strcmp(str, "bad") == 0) return bad;
    if (strcmp(str, "horrendous") == 0) return horrendous;
    if (strcmp(str, "dogshite") == 0) return dogshite;
    return null;
}
const char* rating_to_string(Rating r) {
    switch (r) {
        case epic: return "epic";
        case awesome: return "awesome";
        case good: return "good";
        case mid: return "mid";
        case bad: return "bad";
        case horrendous: return "horrendous";
        case dogshite: return "dogshite";
        default: return "null";
    }
}

// main struct
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
// String fn
void to_lower_inplace(char *str) {
    for (int i = 0; str[i] != '\0'; i++) {
        str[i] = tolower((unsigned char)str[i]);
    }
}
char* to_lower(char *str) {
    for (char *p = str; *p; p++) {
        *p = tolower((unsigned char)*p);
    }
    return str;
}
char* to_upper(const char *str) {
    char* base = malloc(sizeof(str) + 1);
    if (base == NULL) return NULL;
    strcpy(base, str);

    for (char *p = base; *p; p++) {
        *p = toupper((unsigned char)*p);
    }
    return base;
}
// time fn
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
    struct tm t = {0};

    t.tm_mday = l % 100;
    l /= 100;
    t.tm_mon = (l % 100) - 1;
    l /= 100;
    t.tm_year = (l - 1900);

    return mktime(&t);
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
void clear_screen() {
    printf("\033[2J\033[H");
    fflush(stdout);
}
void pause_screen() {
    printf("↵ to continue \033[?25l");
    while (getchar() != '\n');
    getchar();
    printf("\033[?25h");
}
void header() {
    printf("\n== BOOK TRACKER ==\n");
}

//----------------------special functions---------------------------
void load_from_csv (Book *book, size_t s, FILE *fp1, int *lastsl) {
    char buffer[256];
    char *suffer;
    size_t i = 0;

    // loading values
    while (fgets(buffer, sizeof(buffer), fp1) != NULL && i < s) {

        buffer[strcspn(buffer, "\n")] = '\0';

        book[i].sl_no = atoi(strtok(buffer, ","));              // 1

        suffer = strtok(NULL, ",");                             // 2
        if (suffer) {
            book[i].book_name = strdup(suffer);
        } 
        else {
            book[i].book_name = strdup("NA");
        } 

        suffer = strtok(NULL, ",");                             // 3
        if (suffer) {
            book[i].author = strdup(suffer);
        }
        else {
            book[i].author = strdup("NA");
        }

        suffer = strtok(NULL, ",");                             // 4
        book[i].category = get_category(suffer ? suffer : "NA");    

        suffer = strtok(NULL, ",");                             // 5
        book[i].book_id = strdup(suffer ? suffer : "NA");   

        book[i].total_pages = atoi(strtok(NULL, ","));          // 6
        book[i].start_date = atoi(strtok(NULL, ","));           // 7
        book[i].current_page = atoi(strtok(NULL, ","));         // 8
        book[i].isFinished = atoi(strtok(NULL, ","));           // 9
        book[i].isDeleted = atoi(strtok(NULL, ","));            // 10
        book[i].finish_date = atoi(strtok(NULL, ","));           // 11

        suffer = strtok(NULL, ",");                             // 12
        book[i].rating = get_rating(suffer ? suffer : "NA");

        i++;
    }
    *lastsl = 0;
    for (size_t j = 0; j < i; j++) {
        if (book[j].sl_no > *lastsl)
            *lastsl = book[j].sl_no;
}
}

void save_to_csv (Book *book, size_t s) {
    FILE *fp2 = fopen(temp_file, "w");
    for (size_t i = 0; i < s; i++) {
        fprintf(fp2, 
            "%d,%s,%s,%s,%s,%d,%lld,%d,%d,%d,%lld,%s\n", 
            book[i].sl_no,
            book[i].book_name,
            book[i].author,
            category_to_string(book[i].category),
            book[i].book_id,
            book[i].total_pages,
            book[i].start_date,
            book[i].current_page,
            book[i].isFinished,
            book[i].isDeleted,
            book[i].finish_date,
            rating_to_string(book[i].rating)
        );
    }
    fclose(fp2);
    remove(csv_file);
    rename(temp_file, csv_file);
}

void update_progress (Book *book, size_t s, int sl, int pageno) {
    for (size_t i = 0; i < s; i++) {
        if (book[i].sl_no == sl && !book[i].isDeleted) {
            if (!book[i].isFinished) {
                book[i].current_page = pageno;
            }
            else {
                printf("Starting Over? ");
                char ch;
                scanf(" %c", &ch);
                if (tolower(ch) == 'y') {
                    book[i].current_page = pageno;
                }
            }
        }
    }
}

void update_progress_bar(int line_no, int percent) {
    printf("\033[%d;1H", line_no);
    printf("\033[K");

    if (percent < 0) percent = 0;
    if (percent > 100) percent = 100;

    int ch_cnt = (percent * bar_len) / 100;

    printf("[\033[38;5;202m");
    for (int i = 0; i < ch_cnt; i++) printf("#");

    printf("\033[38;5;18m");
    for (int i = 0; i < bar_len - ch_cnt; i++) printf("-");

    printf("\033[0m] %d%%", percent);

    if (percent <= 0) printf(" (\033[31mNot Started\033[0m)");
    else if (percent >= 100) printf(" (\033[38;5;81mFinished\033[0m)");
    else printf(" (\033[38;5;40mReading\033[0m)");

    fflush(stdout);
}

void show_progress_bar(Book *book, size_t s, int *line_nos) {
    int prog[s];

    for (size_t i = 0; i < s; i++) {
        if (book[i].isDeleted || book[i].total_pages == 0) {
            prog[i] = 0;
        } else {
            prog[i] = (book[i].current_page * 100) / book[i].total_pages;
        }
    }

    for (int step = 0; step <= 100; step++) {
        for (size_t i = 0; i < s; i++) {
            if (!book[i].isDeleted) {
                int current = (prog[i] * step) / 100;
                update_progress_bar(line_nos[i], current);
            }
        }
        usleep(10000);
    }
    printf("\033[7B\n");
}

void show_all (Book *book, size_t s) {
    printf("\n");

    int line_no = 1;
    int* book_pg_line = malloc(sizeof(int) * s);

    for (size_t i = 0; i < s; i++) {
        if (!book[i].isDeleted) {

            printf("\033[35m%d. \033[38;5;84m%s\n\033[38;5;197m%s\n\033[33m%s\n\033[36m%s\033[0m\n\nProgress - \033[38;5;198m%d\033[0m/\033[38;5;148m%d\033[0m\n",
                book[i].sl_no,
                book[i].book_name,
                book[i].author,
                category_to_string(book[i].category),
                book[i].book_id,
                book[i].current_page,
                book[i].total_pages
            );

            line_no += 7;
            book_pg_line[i] = line_no;

            printf("\n\nStart  - ");
            show_date_string(book[i].start_date);
            line_no += 2;

            if (book[i].isFinished) {
                printf("Finish - ");
                show_date_string(book[i].finish_date);
                printf("Spent on book: ");
                compare_time(get_today_long_date(), book[i].start_date);
                printf("Rating - \033[94m%s\033[0m\n",
                       to_upper(rating_to_string(book[i].rating)));
                line_no += 3;
            } else {
                printf("Spent on book: ");
                compare_time(get_today_long_date(), book[i].start_date);
                line_no += 1;
            }
        }

        printf("\n");
        line_no += 1;
    }

    show_progress_bar(book, s, book_pg_line);

    free(book_pg_line);
}

void show_all_name (Book *book, size_t s) {
    printf("\n");
    for (size_t i = 0; i < s; i++) {
        if (!book[i].isDeleted) {
            printf("\033[35m%d. \033[38;5;84m%s\n\033[38;5;197m%s\033[0m\n",
                book[i].sl_no,
                book[i].book_name,
                book[i].author
            );
        }
        printf("\n");
    }
}

int select_book (Book *book, size_t s) {
    char buffer[100];
    show_all_name(book, s);
    printf("Enter bookid or book name: ");
    getchar();
    fgets(buffer, sizeof(buffer), stdin);
    char id[100];
    buffer[strcspn(buffer, "\n")] = '\0';  // remove newline
    strcpy(id, buffer);

    for (size_t i = 0; i < s; i++) {
        if (!book[i].isDeleted) {
            char temp1[100];
            char temp2[100];

            strcpy(temp1, book[i].book_name);
            strcpy(temp2, book[i].book_id);

            to_lower_inplace(temp1);
            to_lower_inplace(temp2);
            to_lower_inplace(id);

            if (strcmp(id, temp2) == 0 ||
                strcmp(id, temp1) == 0) {
                return book[i].sl_no;
            }
        }
    }
    return -1;
}

void show_book (Book *book, size_t s, int sl) {
    printf("\n");
    for (size_t i = 0; i < s; i++) {
        if (book[i].sl_no == sl && !book[i].isDeleted) {
            printf("Sl No. - %d\nBookname - %s\nAuthor - %s\nCategory - %s\nBookId - %s\nTotal Pages - %d\nStart Date - %lld\n",
                book[i].sl_no,
                book[i].book_name,
                book[i].author,
                category_to_string(book[i].category),
                book[i].book_id,
                book[i].total_pages,
                book[i].start_date
            );
            if (book[i].isFinished) {
                printf("Finish Date - %lld\nRating - %s\n",
                book[i].finish_date,
                rating_to_string(book[i].rating));
            }
            else {
                printf("Current Page - %d\n", book[i].current_page);
                printf("Reading time: ");
                compare_time(get_today_long_date(), book[i].start_date);
                printf("\n");
            }
        }
    }
    printf("\n");
}

bool check_bookid (Book *book, size_t s, char *id) {
    char *temp = to_lower(id);
    for (size_t i = 0; i < s; i++) {
        if (strcmp(temp, book[i].book_id) == 0) {
            return true;
        }
    }
    return false;
}

void add_book(Book **book, size_t *s, int *lastsl) {
    char ch;
    printf("Do you wanna add a book? ");
    scanf(" %c", &ch);
    getchar();

    if (tolower(ch) != 'y') return;

    size_t new_size = *s + 1;
    Book *temp = realloc(*book, new_size * sizeof(Book));
    if (!temp) {
        printf("Realloc failed\n");
        return;
    }

    *book = temp;
    *s = new_size;

    size_t t = new_size - 1;        // t = index
    char buffer[100];
    char suffer[100];

    (*book)[t].sl_no = ++(*lastsl);

    // book name
    printf("Enter Book name: ");
    fgets(buffer, sizeof(buffer), stdin);
    buffer[strcspn(buffer, "\n")] = 0;
    (*book)[t].book_name = strdup(buffer);

    // author
    printf("Enter Author: ");
    fgets(buffer, sizeof(buffer), stdin);
    buffer[strcspn(buffer, "\n")] = 0;
    (*book)[t].author = strdup(buffer);

    // category
    printf("Enter Category: ");
    fgets(buffer, sizeof(buffer), stdin);
    sscanf(buffer, "%s", suffer);
    (*book)[t].category = get_category(suffer);

    // total pages
    printf("Enter Total Pages: ");
    fgets(buffer, sizeof(buffer), stdin);
    sscanf(buffer, "%d", &(*book)[t].total_pages);

    // start date
    char c;
    printf("Starting today? ");
    scanf(" %c", &c);
    getchar();

    if (tolower(c) == 'y') {
        (*book)[t].start_date = get_today_long_date();
    } else {
        printf("Enter Start Date(yyyymmdd): ");
        fgets(buffer, sizeof(buffer), stdin);
        sscanf(buffer, "%lld", &(*book)[t].start_date);
    }

    // book id
    while (1) {
        printf("Enter Book id: ");
        fgets(buffer, sizeof(buffer), stdin);
        sscanf(buffer, "%s", suffer);

        if (!check_bookid(*book, *s - 1, suffer))
            break;
        else
            printf("ID already exists. Try again.\n");
    }
    (*book)[t].book_id = strdup(suffer);

    (*book)[t].isDeleted = false;

    // current page
    int pageno;
    printf("Enter Current Page: ");
    fgets(buffer, sizeof(buffer), stdin);
    sscanf(buffer, "%d", &pageno);

    update_progress(*book, *s, (*book)[t].sl_no, pageno);

    if ((*book)[t].current_page == (*book)[t].total_pages) {
        (*book)[t].isFinished = true;
        (*book)[t].finish_date = get_today_long_date();

        // rating
        printf("Enter Rating: ");
        fgets(buffer, sizeof(buffer), stdin);
        sscanf(buffer, "%s", suffer);
    (*book)[t].rating = get_rating(to_lower(suffer));
    } else {
        (*book)[t].isFinished = false;
        (*book)[t].finish_date = 0;
    }
    printf("\nBook added successfully.\n");
}

void delete_book(Book *book, size_t s, int sl) {
    for (size_t i = 0; i < s; i++) {
        if (book[i].sl_no == sl) {
            book[i].isDeleted = true;
        }
    }
}


// main shite
int main() {
    char buffer[256];
    int count = 0;
    int lastsl;

    // init file pointer
    FILE *fp1 = fopen(csv_file, "r");

    if (fp1 == NULL) {
        printf("File Not Found\n");
        return 1;   
    }

    // getting line count, setting size & rewind pointer
    while (fgets(buffer, sizeof(buffer), fp1) != NULL) {
        count++;
    }
    size_t s = (size_t) count;
    rewind(fp1);

    // dma 
    Book *book = malloc(sizeof *book * count);
    // init
    load_from_csv(book, s, fp1, &lastsl);

    int choice;

    while (true) {
        clear_screen();
        header();
        printf("1. Show all books\n");
        printf("2. Get book sl\n");
        printf("3. Show book\n");
        printf("4. Add book\n");
        printf("5. Update progress\n");
        printf("6. Delete book\n");
        printf("7. Save & Exit\n");
        printf("\nEnter choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            clear_screen();
            show_all(book, s);
            pause_screen();
        }
        else if (choice == 2) {
            int sl = select_book(book, s);
            printf("Here's the sl: %d\n", sl);
            pause_screen();
        }
        else if (choice == 3) {
            int sl;
            printf("Enter sl no: ");
            scanf("%d", &sl);
            show_book(book, s, sl);
            pause_screen();
        }
        else if (choice == 4) {
            add_book(&book, &s, &lastsl);
            pause_screen();
        }
        else if (choice == 5) {
            int sl, page;
            printf("Enter sl no: ");
            scanf("%d", &sl);
            printf("Enter page: ");
            scanf("%d", &page);
            update_progress(book, s, sl, page);
            pause_screen();
        }
        else if (choice == 6) {
            int sl;
            printf("Enter sl no: ");
            scanf("%d", &sl);
            delete_book(book, s, sl);
            pause_screen();
        }
        else if (choice == 7) {
            save_to_csv(book, s);
            break;
        }
    }

    //----------THE__END----------//
    for (size_t q = 0; q < s; q++) {
        free(book[q].book_name);
        free(book[q].book_id);
        free(book[q].author);
    }
    free(book);
    book = NULL;
    fclose(fp1);
    fp1 = NULL;
    return 0;
}