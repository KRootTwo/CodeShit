#include <stdio.h>
#include <string.h>

int main () {

    int age = 0;
    float gpa = 0.0;
    char grade = '\0';
    char name[50];
    char pname[50];
    char bid = '\0';

    printf("Entre age: ");
    scanf("%d", &age);
    printf("Entre gpa: ");
    scanf("%f", &gpa);
    printf("Entre grade: ");
    scanf(" %c", &grade);
    printf("Entre name: ");
    scanf("%49s", name);
    printf("Entre pet name: ");
    getchar();
    fgets(pname, sizeof(pname), stdin);
    pname[strcspn(pname, "\n")] = '\0';
    
    printf("Entre bid: ");
    scanf(" %c", &bid);

    printf("age: %d\ngpa: %.1f\ngrade: %c\nname: %s\npet name: %s\nbid: %c\n",age, gpa, grade, name, pname, bid);

    return 0;
}

/**
 * 
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


strspn → counts characters that are in a set
strspn(s, x) (the opposite)
Count characters from the start of s that are ONLY from x.

strcspn → counts characters that are NOT in a set
strcspn(s, x)
Count characters from the start of s until you hit ANY character from x.





Nice catch — you’re thinking in the right direction 👍
Tiny correction first, then the clean explanation.

Small fix to your sentence

It’s not:

index of first s in x

It’s:

index of first character from x in s

Now let’s do this properly and simply.

🧠 The pair: strcspn vs strspn

They are opposites.

1️⃣ strcspn(s, x) (you already get this)

Count characters from the start of s until you hit ANY character from x.

Think: ❌ stop when you see something from x

Example:

strcspn("hello\nworld", "\n")  // 5

Stops at \n.

2️⃣ strspn(s, x) (the opposite)

Count characters from the start of s that are ONLY from x.

Think: ✅ keep going while characters belong to x

Example:

strspn("123abc", "0123456789")  // 3

Stops when it hits 'a'.

🔍 Side-by-side (this makes it click)
char s[] = "abc123";
Function	Call	Meaning	Result
strspn	strspn(s, "abc")	count chars IN "abc"	3
strcspn	strcspn(s, "123")	count chars NOT IN "123"	3
🧠 One-line mental models (memorize these)

strspn(s, x)
👉 “How long does s start with characters from x?”

strcspn(s, x)
👉 “How long does s start without characters from x?”

🧪 Real-life intuition

strspn → validating prefixes (digits, whitespace, hex chars)

strcspn → finding separators (\n, ,, :)

⚡ Ultra-short rule

strspn = allowed set
strcspn = forbidden set

If that clicks — congrats, you officially understand C string scanning, not just use it





 * 
 */