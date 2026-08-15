#include <iostream>

int main () {

    int a {1};
    long b {12l};
    float c {1.2f};
    double d {1.234f};

    char e {'e'};
    std::string f {"sde"};

    std::cout << a << '\n';
    std::cout << b << '\n';
    std::cout << c << '\n';
    std::cout << d << '\n';
    std::cout << e << '\n';
    std::cout << f << '\n';

    int s;

    std::cout << "Entre: \n";
    std::cin >> s;

    std::cout << "BAN -> " << s;

    // cuz we're replacing the value immeadiately
    int t1 {};
    std::cin >> t1;

    // cuz we need the value
    int t2 {0};
    std::cout << t2 << '\n';

    [[maybe_unused]] int unused {67};


    return 0;
}