BITS 64
default rel

section .data
    txt1 db "Name nga: ", 0
    txt2 db "Sup nga ", 0
    
section .bss
    name resb 64
    
section .text
    global _start
    
_start:
    
    mov rax, txt1
    call _printTxt

    call _getInp

    mov rax, txt2
    call _printTxt
    
    mov rax, name
    call _printTxt

    mov rax, 60
    mov rdi, 0
    syscall

_getInp:
    mov rax, 0
    mov rdi, 0
    mov rsi, name
    mov rdx, 64
    syscall
ret

_printTxt:
    push rax
    xor rbx, rbx

.loop:
    cmp byte [rax], 0
    je .done
    inc rax
    inc rbx
    jmp .loop

.done:
    mov rax, 1
    mov rdi, 1
    pop rsi
    mov rdx, rbx
    syscall
ret

; _printTxt:
;     push rax
;     mov rbx, 0

;     _loop:
;         inc rax
;         inc rbx
;         cmp [rax], 0
;     jne _loop

;     mov rax, 1
;     mov rdi, 1
;     pop rsi
;     mov rdx, rbx
;     syscall
; ret