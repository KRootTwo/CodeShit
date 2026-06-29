BITS 64
default rel

section .bss
    dig resb 1
    age resb 8

section .data
    t1 db "number nigga: ", 0
    t2 db "haha lol - "

section .text
    global _start

_start: 

    mov rax, t1
    call _printTxt

    call _getInp

    mov rax, t2
    call _printTxt

    mov rsi, age
    call _loadAge
    call _printInt

    call _nl

    mov rax, 60
    mov rdi, 0
    syscall

_nl:
    sub rsp, 1
    mov byte [rsp], 10

    mov rax, 1
    mov rdi, 1
    mov rsi, rsp
    mov rdx, 1
    syscall

    add rsp, 1
ret

_printTxt:
    push rax
    xor rbx, rbx

    .loop0:
        cmp byte [rax], 0
        je .done
        inc rax
        inc rbx
    jmp .loop0

    .done:
        mov rax, 1
        mov rdi, 1
        pop rsi
        mov rdx, rbx
    syscall
ret

_getInp:
    mov rax, 0
    mov rdi, 0
    mov rsi, age
    mov rdx, 8
    syscall
ret

_printInt:
    mov rbx, 10
    xor r8, r8

    .loop1:
        xor rdx, rdx
        div rbx
        push rdx
        inc r8
        cmp rax, 0
    jne .loop1

    .loop2:
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
    jne .loop2
ret

_loadAge:
    xor rax, rax

    .loop3:
        mov bl, [rsi]

        cmp bl, 10
        je .done1

        sub bl, '0'
        imul rax, 10
        add rax, rbx

        inc rsi
        jmp .loop3

    .done1:
ret



