#include <stdio.h>
#define DEBUG

int main() {

	#ifdef DEBUG
	printf("We in Debug nigga: %s: %d\n", __FILE__, __LINE__);
	#endif

	return 0;
}