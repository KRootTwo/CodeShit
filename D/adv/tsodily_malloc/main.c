#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>
#include <ctype.h>
#include <time.h>
#include <unistd.h>
#include <assert.h>

#define HEAP_CAPACITY 640000    // allocated heap

char heap[HEAP_CAPACITY] = {0}; // total heap we're working wit
size_t heap_size = 0;           // current heap size

void *heap_alloc (size_t size) 
{
    assert(heap_size + size <= HEAP_CAPACITY);
    void *result = heap + heap_size;
    heap_size += size;

    return result;
}

void heap_free (void *ptr) 
{
    (void) ptr;
    assert(false && "TODO: heap_free is not implemented");

}

void heap_collect ()
{
    assert(false && "TODO: heap_collect is not implemented");

}

int main() {
    
    char *root = heap_alloc(26);

    for (size_t i = 0; i < 26; ++i) {
        root[i] = i + 'A';
    }
    
    heap_free(root);
    return 0;
}