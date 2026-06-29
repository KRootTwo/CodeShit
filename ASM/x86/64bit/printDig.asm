BITS 64
default rel

section .data
    dig db 0, 10

section .text
    global _start

_start:
    mov rax, 9
    call printDig
    syscall

    mov rax, 60
    mov rdi, 0
    syscall

printDig:
    add rax, 48
    mov [dig], al
    mov rax, 1
    mov rdi, 1
    mov rsi, dig
    mov rdx, 2
    ret