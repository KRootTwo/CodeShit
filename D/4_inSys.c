#include <stdio.h>


int main () {

    char shit[30] = ""; 
    int n = 0;
    float v = 0.0f;

    printf("Entre sum shite: ");
    fgets(shit, sizeof(shit), stdin);
    sscanf(shit, "%d", &n);
    printf("mfdoom %d\n", n);

    printf("Entre lts version: ");
    fgets(shit, sizeof(shit), stdin);
    sscanf(shit, "%f", &v);
    printf("%.1f? That's a Deprecated Version BTW.\n", v);

    return 0;
}





/*
 [1] fgets() — safe input (the hero)

fgets(buffer, size, stdin);

- reads until newline OR size-1 chars
- always null-terminates=
- includes the newline (\n) if it fits
- never overflows

Example:

char buf[100];
fgets(buf, sizeof(buf), stdin);

If user types:
123 45⏎

Buffer becomes:
"123 45\n\0"


 [2] sscanf() — controlled parsing

sscanf(string, "format", &vars...);

- works like scanf
- BUT reads from a string, not stdin
- returns how many items were parsed

Example:

int a, b;
int count = sscanf(buf, "%d %d", &a, &b);

count == 2 → success
count < 2 → invalid input

Why scanf() causes pain

Example:

int x;
char c;

scanf("%d", &x);
scanf("%c", &c);


If input is:

5⏎


What happens:

%d reads 5

\n stays in buffer

%c reads \n instead of user input

classic beginner trap (you hit this already).

How fgets + sscanf fixes EVERYTHING
Same program, safe version
char buf[100];
int x;
char c;

fgets(buf, sizeof(buf), stdin);
sscanf(buf, "%d", &x);

fgets(buf, sizeof(buf), stdin);
sscanf(buf, " %c", &c);


no leftover input

no surprise newlines

predictable behavior

5️⃣ Input validation (huge win)

With scanf:

scanf("%d", &x);   // fails silently


With sscanf:

if (sscanf(buf, "%d", &x) != 1) {
    printf("Invalid number\n");
}


Now you actually know when input is wrong.

6️⃣ Practical example (calculator-style)
char buf[100];
float a, b;

printf("Enter two numbers: ");
fgets(buf, sizeof(buf), stdin);

if (sscanf(buf, "%f %f", &a, &b) == 2) {
    printf("Sum = %.2f\n", a + b);
} else {
    printf("Invalid input\n");
}


This is production-quality input handling.

7️⃣ When is scanf okay?

scanf is acceptable when:

quick throwaway programs

competitive programming

you fully control input

For learning C properly → avoid it.
*/