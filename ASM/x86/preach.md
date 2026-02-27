# **32 Bit nasm**

## **Registers**


| Register | Purpose (rough idea)                  |
| -------- | ------------------------------------- |
| **EAX**  | accumulator (syscall number, results) |
| **EBX**  | base (argument 1)                     |
| **ECX**  | counter (loops, arg2)                 |
| **EDX**  | data (arg3)                           |
| **ESI**  | source index                          |
| **EDI**  | destination index                     |
| **EBP**  | base pointer (stack frame)            |
| **ESP**  | stack pointer                         |

## **Special Registers**


| Register   | What it does                                |
| ---------- | ------------------------------------------- |
| **EIP**    | instruction pointer (where code is running) |
| **EFLAGS** | flags (zero, carry, etc.)                   |

## **Some Standard values**


| eax value | syscall |
| --------- | ------- |
| 1         | exit    |
| 4         | write   |
| 3         | read    |

## **Compile & Run (32 Bit)**

**nasm -f elf -o first.o first.asm
ld -m elf_i386 -o first first.o
./first
echo $?**

## **GDB - where pdb came from ig. works kinda similar**


| Commands                | Functions                      |
| ----------------------- | ------------------------------ |
| gdb program_name        | enters gdb                     |
| layout asm              | opens a asm layout             |
| break _start            | creates a breakpoint at _start |
| run                     | runs the program               |
| stepi                   | runs next line                 |
| info registers reg_name | shows info about reg           |
| exit                    | self explainatory              |


| Commands      | Functions                           |
| ------------- | ----------------------------------- |
| x/x $ebx      | shows stack data (value at address) |
| x/x 0xaddress | shows values at address             |

## **Data Definition Directives**


| DDD | Define initialized data in meomry | Size<br />(Bytes) | Size<br />(Bits) |
| --- | --------------------------------- | ----------------- | ---------------- |
| DB  | Define Byte                       | 1                 | 2                |
| DW  | Define Word                      | 2                 | 4                |
| DD  | Define Doubleword                 | 4                 | 8                |
| DQ  | Define Quadword                   | 8                 | 16               |
| DT  | Define Tenbyte                    | 10                | 80               |

## **Register representation**

EBX (32 bits)
└── BX (lower 16 bits)
    ├── BH (high 8 bits)
    └── BL (low 8 bits)


| reg | repr           | size(bits) |
| --- | -------------- | ---------- |
| eax | extended a reg | 32         |
| ebx | extended b reg | 32         |
| ecx | extended c reg | 32         |
| edx | extended d reg | 32         |

**First Half**


| reg | repr          | size(bits) |
| --- | ------------- | ---------- |
| ax  | lower 16 bits | 16         |
| bx  | lower 16 bits | 16         |
| cx  | lower 16 bits | 16         |
| dx  | lower 16 bits | 16         |

**Second Half**


| reg | repr          | size(bits) |
| --- | ------------- | ---------- |
| bh  | higher 8 bits | 8          |
| bl  | lower 8 bits  | 8          |
