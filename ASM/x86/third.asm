section .data
    num1 DD 6
    num2 DD 7
section .text
global _start 

_start:
    MOV ebx, [num1]
    MOV ecx, [num2]
    MOV eax, 1
    INT 80h