section .data
    text db "Sup Fuck Nigga", 10

section .text
    global _start

_start:
    mov rax, 1
    mov rdi, 1
    mov rsi, text
    mov rdx, 15
    syscall

    mov rax, 60
    mov rsi, 0
    syscall