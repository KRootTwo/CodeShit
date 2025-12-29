#include <stdio.h>
#include <string.h>

int main () {


    char item[50] = "";
    float price = 0.0f;
    int quantity = 0;
    char currency = '$';
    float total = 0.0f;

    printf("What item would u like to buy: ");
    fgets(item, sizeof(item), stdin);
    // item[strlen(item) - 1] = '\0';
    item[strcspn(item, "\n")] = '\0';
    
    printf("What is the price looking fam: ");
    scanf("%f", &price);

    printf("How many nigga: ");
    scanf("%d", &quantity);

    total = price * quantity;

    if (quantity == 1) {
        printf("For %d %ss total bill is %.2f %c", quantity, item, total, currency);
    }
    else {
        printf("For %d %s total bill is %.2f %c", quantity, item, total, currency);
    }


    return 0;
}


/*
    strcspn = “string complement span”
    strcspn(s, x) → “index of first x in s”
    returns an int value

    strspn → counts characters that are in a set
    strcspn → counts characters that are NOT in a set
    
    */