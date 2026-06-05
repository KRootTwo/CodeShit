#include <stdio.h>
#include <stdint.h>
#include <string.h>

uint32_t poof(int a, int b) {
    uint32_t res = 1;
    uint32_t s = b;
    for (uint32_t i = 0; i < s; i++) {
        res *= a;
    }
    return res;
}
void float_op(float f) {
    uint32_t bits;

    memcpy(&bits, &f, sizeof(bits));

    uint32_t sign;
    uint32_t expo;
    uint32_t mant;

    sign = (bits >> 31) & 1;
    expo = (bits >> 23) & 0xFF;
    mant = (bits) & 0x7FFFFF;

    
    int E = expo - 127;
    float M = 1.0f + ((float)mant / (1 << 23));
    float n = M * poof(2, E);
    if (sign) n = -n;

    printf("sign = %u\nexpo = %u\nmant = %u\n\nn = %f\n", sign, expo, mant, n);
}
int main() {

    float_op(243.9267);
    
    return 0;
}