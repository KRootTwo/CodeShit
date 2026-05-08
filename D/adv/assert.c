#include <stdio.h>
#include <assert.h>

int divide (int nume, int deno) {
    assert(deno != 0);
    return nume / deno;
}

int main() {
    
    printf("%d\n", divide(3, 0));
    
    return 0;
}