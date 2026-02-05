#include <stdio.h>
#include <stdbool.h>
#include <string.h>

#define PI = 3.14;

int main() {

    int age = 0;
    float gpa = 0.0;
    char grade = '\0';
    char name[50];
    char bid = '\0';
    int c = 0;
    // const float E = 1.21;

    printf("Enter bitch-int: ");
    scanf("%d", &c);

    printf("Enter bitch-char: ");
    scanf(" %c", &bid);

    getchar();
    printf("Entre name: ");
    // scanf("%49s", &name);
    fgets(name, sizeof(name), stdin);
    name[strlen(name) - 1] = '\0';

    printf("Entre age: ");
    scanf("%d", &age);

    getchar();
    printf("Entre grade: ");
    scanf(" %c", &grade); // need that white space before %c otherwise scanf will read the enter(\n) from previous input buffer as an input

    printf("Entre gpa: ");
    scanf("%f", &gpa);

    printf("\nName: %s\nAge: %d\nGPA: %.2f\nGrade: %c\nBitch-id: %d\nBitch-char: %c", name, age, gpa, grade, c, bid);


    return 0;
}

/*
format specifier - special token that begins with % symbol 
                   followed by a character that specifies data
                   and optional modifiers (width, precision, flags)
                   they control how dat is displayed or interpreted.

    Format Specifier
	

Description

%c       For character type.

%d       For signed integer type.

%e or %E       For scientific notation of floats.

%f       For float type.

%g or %G       For float type with the current precision.

%i       signed integer

%ld or %li       Long

%lf       Double

%Lf       Long double

%lu       Unsigned int or unsigned long

%lli or %lld       Long long

%llu       Unsigned long long

%o       Octal representation

%p       Pointer

%s       String

%u       Unsigned int

%x or %X       Hexadecimal representation

%n       Prints nothing

%%       Prints % character



strspn → counts characters that are in a set
strspn(s, x) (the opposite)
Count characters from the start of s that are ONLY from x.

strcspn → counts characters that are NOT in a set
strcspn(s, x)
Count characters from the start of s until you hit ANY character from x.

    Bug 2: fgets keeps the newline
fgets(item, sizeof(item), stdin);
If you type:
Laptop
item actually becomes:
"Laptop\n"
That newline will show up later when printing or formatting.
    Simple cleanup (optional but good)

item[strcspn(item, "\n")] = '\0';

    Real bug: item[strlen(item) - 1] = '\0';
This can crash.
If:
the user just presses Enter, or
fgets reads a full line without \n
then:
strlen(item) - 1 can become -1 or chop a valid character.
That’s undefined behavior.
    Correct, safe way
Only remove \n if it exists:

item[strcspn(item, "\n")] = '\0';

This is the canonical C solution. Burn it into muscle memory.
*/