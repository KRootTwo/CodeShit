section .data
    num DB 5

section .text 
global _start

_start :
    MOV eax, 1
    MOV ebx, [num]  ; [] gets the number from the address
    INT 80h




    ; MOV ebx, num    ; <== gets the address
