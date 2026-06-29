default rel     ; suppress warning

section .data
    digit db 0, 10

section .text
    global _start

_start:
    mov rax, 9
    call _printRAXdigit

    mov rax, 60
    mov rdi, 0
    syscall


_printRAXdigit:
    add rax, 48
    mov [digit], al
    mov rax, 1
    mov rdi, 1
    mov rsi, digit
    mov rdx, 2
    syscall
    ret



; If you want to keep using your exact syntax but want NASM to default to relative addressing across your whole file without typing rel everywhere, you can add this directive to the very top of your .asm file:
; Code snippet

; default rel     ; Set default addressing to RIP-relative

; section .data
;     digit db 0, 10
; ...

; If you do this, your original mov rsi, digit will automatically compile as RIP-relative, and the warning will disappear!


