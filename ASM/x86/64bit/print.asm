BITS 64
default rel

section .data
   txt db "HI KTV", 10, 0 
   txt2 db "HI ZTV", 10, 0 
    
section .bss
    
    
section .text
    global _start
    
_start:
    
    mov rax, txt
    call _printText

    mov rax, txt2
    call _printText
    
    mov rax, 60
    mov rdi, 0
    syscall

_printText:
    push rax
    mov rbx, 0

    _printLoop:
        inc rax
        inc rbx
        cmp [rax], 0
        jne _printLoop

    mov rax, 1
    mov rdi, 1
    pop rsi
    mov rdx, rbx
    syscall

    ret