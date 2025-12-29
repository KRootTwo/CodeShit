gcclm {
    gcc -Wall -Wextra exp.c -o exp -lm && ./exp
}

crun() {
  gcc "$1" -Wall -Wextra -O2 -o "${1%.c}" && "./${1%.c}"
}
