BITS 64
default rel

section .bss
    dig resb 1

section .text
    global _start

_start:

    mov rax, 90210
    call _printShit

    mov rax, 60
    mov rdi, 0
    syscall

; ------------------
_printShit:

    mov rbx, 10 ; divider
    mov r8, 0   ; counter

_loop:
    xor rdx, rdx
    div rbx     ; rax / rbx
    push rdx    ; remainder in rdx, quotient in rax 
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
; ------------------

