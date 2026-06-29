BITS 64
default rel
%include "linux64.inc"

section .data
    
    
section .bss
    dig resb 1
    
section .text
    global _start
    
_start:
    
    mov rax, 256
    call _printInt
    
    nl
    exit

_printInt:
    mov r8, 0
    mov rbx, 10
_loop:    
    xor rdx, rdx
    div rbx
    push rdx
    inc r8
    cmp rax, 0
    jne _loop

_loop2:
    pop rax
    add al, 48
    mov [dig], al
    dec r8

    mov rax, 1
    mov rdi, 1
    mov rsi, dig
    mov rdx, 1
    syscall

    cmp r8, 0
    jne _loop2

    ret


; use 
; xor rdx, rdx
; instead
; mov rdx, 0