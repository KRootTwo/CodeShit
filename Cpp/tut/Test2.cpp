#include <iostream>

int main () {

    std::cout << "Enter a number: " ;
    int x {};
    std::cin >> x;
    std::cout << "You entered: " << x << '\n';


    int a{};
    int b{};
    int c{};

    std::cin >> a >> b >> c;
    std::cout << "You entered " << a << ", " << b << ", and " << c << ".\n";

    return 0;
}