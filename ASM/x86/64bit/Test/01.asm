BITS 64
default rel


section .data
    text db "Entre name: "      ;12
    greet db "Sup blud "         ;8
    

section .bss
    name resb 16

section .text
    global _start

_start:

    call printText
    call getName
    call printGreet
    call printName

    mov rax, 60
    mov rdi, 0
    syscall

getName:
    mov rax, 0
    mov rdi, 0
    mov rsi, name
    mov rdx, 16
    syscall
    ret

printName:
    mov rax, 1
    mov rdi, 1
    mov rsi, name
    mov rdx, 16
    syscall
    ret

printGreet:
    mov rax, 1
    mov rdi, 1
    mov rsi, greet
    mov rdx, 9
    syscall
    ret
    
printText:
    mov rax, 1
    mov rdi, 1
    mov rsi, text
    mov rdx, 12
    syscall
    ret
