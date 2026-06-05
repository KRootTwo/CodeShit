#include <iostream>
#include <string>

// using namespace std;

int main() {

    int a = 1;      // C style
    int b (2);      // Early C++
    int c {3};      // Modern C++ 11 { Recommended }

    int d = 1.1;      //    ] -----|
    int e (2.2);      //    ] --- shiit happens
    

    std::cout << d << e << std::endl;
    
    std::string s{"Hello"};     // Modern shit

    std::cout << a << b << c << '\n';
    


    return 0;
}