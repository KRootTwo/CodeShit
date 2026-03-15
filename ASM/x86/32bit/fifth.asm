section .data
    lst DB 1,2,3,4,0

section .text
global _start

_start:
    MOV bl, [lst]
    MOV eax, 1
    INT 80h