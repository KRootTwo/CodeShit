#include <bits/stdc++.h>
#include <cstddef>
#include <utility>
#include <vector>
using namespace std;

int secMax(vector<int>& a) {

}

int main() {

    // ----- PAIRS -----

    pair<int, int> p = {1, 3};

    cout << p.first << '\n' << p.second << '\n';
    
    pair<int, pair<int, int>> p2 = {9, p};
    
    std::cout << '\n';
    
    cout << p2.first << '\n' << p2.second.first << '\n' << p2.second.second << '\n';

    // pair<int, pair<int, int>> p3 = {9, {2, 3}};

    int arr[] = {1, 2, 3, 4, 5};

    for (size_t i = 0; i < sizeof(arr) / sizeof(arr[0]); i++) {
        std::cout << arr[i] << '\n';
    }

    pair<int, int> parr[] = {{1, 2}, {2, 3}, {3, 4}};

    for (size_t i = 0; i < sizeof(parr)/sizeof(parr[0]); i++) {
        std::cout << parr[i].first << '\t' << parr[i].second << '\n';
    }


    
    return 0;
}