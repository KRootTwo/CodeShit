BITS 64
default rel

section .data
    t1 db "wtf man"
    t2 db "haiaaaaaa"


section .bss
    res resb 16

section .text
    global _start

_start:


    mov rax, 60
    mov rdi, 0
    syscall
