#include <stdio.h>
#include <unistd.h>


int g = 0;       // P's variables (GOD's vars)
double G = 0.0;  // P's variables (GOD's vars)

void fincr(int);
void tincr(int *);


int main() {
    char ukip[10] = "";

    // 2
    printf("Enperimante de \"C\" de CALLE BY VALUE\n");
    printf("\nEntre an integer boi: ");
    fgets(ukip, sizeof(ukip), stdin);
    sscanf(ukip, "%d", &g);
    int n = g;

    printf("\nPassing into the function...\n");
    tincr(&g);
    sleep(1);
    printf("\nValue after da function: %d\n", g);
    sleep(1);
    printf("\nOriginal Value: %d\n", n);

    sleep(2);
    printf("\n\033[36mWait what the fuck?!?!?!?!\n");
    sleep(1);
    printf("\nI thought \"C\" was call by value. P! WTF is this P?\n");
    sleep(2);
    printf("\nP, Nigga u listening?\n");
    sleep(2);
    printf("\nP...\033[0m\n");

    sleep(2);

    printf("\n\033[32mK, Nigga Shut yo bitch ass up. Stop fucking calling the Programming Gods everytime u fuck sum shit up. Nigga Imma kill ya.\033[0m\n");
    sleep(4);
    printf("\n\033[36mAYY NIGGA FIX YO SHIT THEN TALK TO ME.\033[0m\n");

    sleep(2);
    printf("\n\033[32mEVERYTHNG IS WORKING PROPERLY NIGGA FIX MY SHIT?? FIX YO SHIT FIRST U FAT BASTARD\033[0m\n");

    sleep(2);
    printf("\n\033[36mWHO U CALLING FAT? NIGGA.\033[0m\n");

    sleep(2);
    printf("\n\033[32mSTOP SHOUTING U LITTLE SHIT. U USE ARCH OFC YOU'RE FAT.\033[0m\n");

    sleep(2);
    printf("\n\033[36m...fair. fair. But what the fuck is going on with this program. Is it bwoken? (Kimi Raikkonen intensifies)\033[0m\n");

    sleep(2);
    printf("\n\033[32mWait lemme see... MF u passing pointers to the the function ofc that gonna change it's value u dumb bitch.\033[0m\n");

    sleep(2);
    printf("\n\033[36mWait What?...\033[0m\n");

    sleep(2);
    printf("\n\033[32mYou passed pointer values of the variable when u put that fucking asterisk(*) and the ampersand(&) there u idiot. C IS ALWAYS CALL BY VALUE put this shitter in yo head boiii\033[0m\n");

    sleep(2);
    printf("\n\033[36mOhhh So.... anyway THANKS GRANDPA :).\033[0m\n");

    sleep(2);
    printf("\n\033[32mI'M NOT YO FUCKING. BEFORE CALLING ME NIGGA READ THE FUCKING MANUAL U BITCH. CALL ME AGAIN LIKE THAT IMMA KILL U NIGGA...DICKHEAD.\033[0m\n");


    // printf("\n\033[36m .\033[0m\n");
    // printf("\n\033[32m .\033[0m\n");



    return 0;
}

void tincr(int *a) {
    *a = 10;
}

void fincr(int a) {
    ++a;
}




       











/*

printf("\033[31mRED TEXT\033[0m\n");
printf("\033[32mGREEN TEXT\033[0m\n");
printf("\033[34mBLUE TEXT\033[0m\n");

What this means:

    \033[ → start ANSI escape

    31m → red

    0m → reset back to normal (IMPORTANT)

If you forget \033[0m, everything after stays colored 

| Color   | Code |
| ------- | ---- |
| Black   | `30` |
| Red     | `31` |
| Green   | `32` |
| Yellow  | `33` |
| Blue    | `34` |
| Magenta | `35` |
| Cyan    | `36` |
| White   | `37` |

*/