#include <iostream>
#include <cstdlib>
#include <ostream>
#include <sys/types.h>

int getUV() {
    std::cout << "Enter a Number bro: " << std::flush;
    int inp {};
    std::cin >> inp;
    return inp; 
}
void printGod() {
    std::cout << "KTV";
}
int retFive() {
    return 5;
}

/*
Most often, forward declarations are used to tell the compiler about the existence 
of some function that has been defined in a different code file. Reordering isn’t 
possible in this scenario because the caller and the callee are in completely 
different files!
*/
void getShit(int);

int main() {

    int a { getUV() };
    std::cout << "Here's yo number blud: " << a << '\n';

    std::cout << retFive() << '\n';

    getShit(a);

    return EXIT_SUCCESS;
}

void getShit(int s) {
    for (int i {0}; i < s; i++) {
        std::cout << "Shittt" << '\n';
    }
}
