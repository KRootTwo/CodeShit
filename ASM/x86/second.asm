section .data
    num DB 5

section .text 
global _start

_start :
    MOV eax, 1
    MOV ebx, [num]  ; [] gets the number from the address
    INT 80h








; GDB - where pdb came from ig. works kinda similar
;
; gdb program => enters gdb
; layout asm => opens a asm layout
; break _start => creates a breakpoint at _start
; run => runs the program
; stepi => runs next line
; info registers eax => shows info about reg
; exit => self explainatory
;
; x/x $ebx => shows stack data (value at address)








    ; MOV ebx, num    ; <== gets the address

    ; DB - Declare Byte     (1B)
    ; DW - Declare Word     (2B)
    ; DD - Declare Double   (4B)
    ; DQ -                  (8B)
    ; DT -                  (10B)