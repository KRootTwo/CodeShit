       
       
       
       
mkdir -p /home/ktv/CodeShit/asm/bin

nasm -f elf64 \"$fullFileName\" -o /home/ktv/CodeShit/asm/bin/\"$fileNameWithoutExt\".o


ld -o /home/ktv/CodeShit/asm/bin/\"$fileNameWithoutExt\" /home/ktv/CodeShit/asm/bin/\"$fileNameWithoutExt\".o

/home/ktv/CodeShit/asm/bin/\"$fileNameWithoutExt\"
       
       
       
"c": "clear && mkdir -p ~/CodeShit/D/bin && gcc -Wall -Wextra -O2 \"$fullFileName\" -o ~/CodeShit/D/bin/\"$fileNameWithoutExt\" && ~/CodeShit/D/bin/\"$fileNameWithoutExt\"",
       
       
       
".asm": "mkdir -p /home/ktv/CodeShit/asm/bin && nasm -f elf64 \"$fullFileName\" -o /home/ktv/CodeShit/asm/bin/\"$fileNameWithoutExt\".o && ld -o /home/ktv/CodeShit/asm/bin/\"$fileNameWithoutExt\" /home/ktv/CodeShit/asm/bin/\"$fileNameWithoutExt\".o && /home/ktv/CodeShit/asm/bin/\"$fileNameWithoutExt\""
       
       
".asm": "mkdir -p /home/ktv/CodeShit/asm/bin && nasm -f elf64 \"${file}\" -o \"/home/ktv/CodeShit/asm/bin/${fileBasenameNoExtension}.o\" && ld -o \"/home/ktv/CodeShit/asm/bin/${fileBasenameNoExtension}\" \"/home/ktv/CodeShit/asm/bin/${fileBasenameNoExtension}.o\" && \"/home/ktv/CodeShit/asm/bin/${fileBasenameNoExtension}\"",
