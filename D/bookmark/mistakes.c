// void add_book (Book **book, size_t *s, int *lastsl) {
//     size_t t = *s + 1;
//     char ch;
//     printf("Do you wanna add a book?");
//     scanf(" %c", &ch);

//     if (tolower(ch) == 'y') {
//         Book *temp = realloc(*book, t * sizeof **book);
//         if (!temp) {
//             printf("Realloc failed\n");
//             return;
//         }
//         *book = temp;
//         *s = t;
//         char buffer[100];

//         // sl no
//         *book[t]->sl_no = lastsl + 1;

//         // book name
//         printf("Enter Book name: ");
//         fgets(buffer, sizeof(buffer), stdin);
//         sscanf(buffer, "%s", book[t].book_name);

//         // author
//         printf("Enter Author: ");
//         fgets(buffer, sizeof(buffer), stdin);
//         sscanf(buffer, "%s", book[t].author);

//         // category
//         char *temp;
//         printf("Enter Category: ");
//         fgets(buffer, sizeof(buffer), stdin);
//         sscanf(buffer, "%s", temp);
//         book[t].category = get_category(temp);

//         // total pages
//         printf("Enter Total Pages: ");
//         fgets(buffer, sizeof(buffer), stdin);
//         sscanf(buffer, "%d", &book[t].total_pages);
        
//         // start date
//         char c;
//         printf("You startig this book today? ");
//         scanf(" %c", &c);
//         if (tolower(c) == 'y') {
//             book[t].start_date = get_today_long_date();
//         } else {
//             printf("Enter Start Date(yyyymmdd): ");
//             fgets(buffer, sizeof(buffer), stdin);
//             sscanf(buffer, "%lld", &book[t].start_date);
//         }
        
//         // bookid
//         bokid :
//         printf("Enter Book id: ");
//         fgets(buffer, sizeof(buffer), stdin);
//         sscanf(buffer, "%s", temp);
//         if (check_bookid(book, t - 1, temp)) {
//         } else {
//             goto bokid;
//         }

//         book[t].isDeleted = false;

//         int pageno;
//         printf("Enter Total Pages: ");
//         fgets(buffer, sizeof(buffer), stdin);
//         sscanf(buffer, "%d", &pageno);
//         update_progress(book, t, book[t].sl_no, pageno);

//         if (book[t].current_page == book[t].total_pages) {
//             book[t].isFinished = true;
//         } else {
//             book[t].isFinished = false;
//             printf("You finished this book today? ");
//             scanf(" %c", &c);
//             if (tolower(c) == 'y') {
//                 book[t].finish_date = get_today_long_date();
//             } else {
//                 printf("Enter Finish Date(yyyymmdd): ");
//                 fgets(buffer, sizeof(buffer), stdin);
//                 sscanf(buffer, "%lld", &book[t].start_date);
//             }
//         printf("Enter Rating(epic, awesome, good, mid, bad, horrendous, dogshite): ");
//         fgets(buffer, sizeof(buffer), stdin);
//         sscanf(buffer, "%s", temp);
//         book[t].rating = get_rating(to_lower(temp));
//         }
//     }
    
// }