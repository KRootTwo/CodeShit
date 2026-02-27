section .data
    str1 DB "ABA",0     ; <== Null terminator w/o this data can leak
    str2 DB "CDE",0     ;     to the next or prev address

section .text
global _start

_start: 
    MOV bl, [str1]
    MOV eax, 1
    INT 80h