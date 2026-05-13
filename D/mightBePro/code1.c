// #include <stdlib.h>
// #include <stdio.h>
// #include <stdbool.h>
// #include <string.h>
// #include <stddef.h>

// int c;
// typedef struct {
//     char* name;
//     long accno;
//     int age;
//     float balance;
// } User;
// void intro() {
//     printf("Welcome to Sh-Bank\n");
//     printf("1. Create account\n2. Deposit Money\n3. Withdraw Money\n4.Check Balance\n");
// }
// int userFind(FILE *fp, long accN) {
//     int sl = 0;
//     char buff[100];
//     User *u = malloc(sizeof(User) * c);
//     while (fgets(buff, sizeof(buff), fp) != NULL) {
        
//     }
// }
// bool createAcc (FILE *fp, char *name) {
//     char buff[100];
//     while (fgets(buff, sizeof(buff), fp) != NULL) {
        
//     }
// }
// int main() {
//     char buff[100];
//     intro();
//     int n;
//     greet:
//     printf("Choose what to do: \n");
//     scanf("%d", &n);
//     if (n < 1 || n > 4) {
//         printf("Invalid Option\n");
//         goto greet;
//     }

//     // init file pointer
//     FILE *fp1 = fopen("/home/ktv/CodeShit/D/mightBePro/data.csv", "r+");
//     if (fp1 == NULL) {
//         printf("Error opening file\n");
//         goto end;
//     }
//         while (fgets(buff, sizeof(buff), fp1) != NULL) {
//         c++;
//     }

//     switch (n) {
//     case 2:


//     }
    
//     while (fgets(buf, sizeof(buf), fp1) != NULL) {
        
//     }

//     end:
//     printf("Exiting...");
//     free(fp1);
//     fp1 = NULL;
//     return 0;
// }