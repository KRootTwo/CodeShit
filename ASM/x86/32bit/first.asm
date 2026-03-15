section .data ; <== used for variables/data

section .text ; <== actual code
global _start ; tells where to start. _start is a label

_start:
        MOV eax, 1      ; MOV => move to reg. eax => reg name. 1 => value
                        ; syscall no = 1
                        ; in linux: 1 = exit()

        MOV ebx, 1      ;                     ebx => reg name.
                        ; argument = 1

        INT 80h         ; INT => interrupt to Linux kernel. h => hexadecimal.
                        ; Execute the system call



; nasm -f elf -o first.o first.asm
; ld -m elf_i386 -o first first.o
; ./first
; echo $?
;
; | Register | Meaning        |
; | -------- | -------------- |
; | eax      | syscall number |
; | ebx      | arg1           |
; | ecx      | arg2           |
; | edx      | arg3           |
; | eax value | syscall |
; | --------- | ------- |
; | 1         | exit    |
; | 4         | write   |
; | 3         | read    |

