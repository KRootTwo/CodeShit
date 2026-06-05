#include <stdio.h>

int main() {
    
    float tot_page = 323;
    float curr_page = 120;
    
    if ((int)curr_page <= 0) {
        printf("|--------------------| (0%%) Not Started\n");
    }
    else if ((int)curr_page == (int)tot_page) {
        printf("|####################| (100%%) Finished\n");
    }
    else {
        float two_parf = (curr_page/tot_page) * 20;
        int two_par = two_parf;
        printf("%d\n|", two_par);
        for (int i = 0; i < two_par; i++) {
            printf("#");
        }
        for (int j = 0; j < (20 - two_par); j++) {
            printf("-");
        }
        printf("| (%d %%) Reading...\n", two_par);
    }
    
    return 0;
}