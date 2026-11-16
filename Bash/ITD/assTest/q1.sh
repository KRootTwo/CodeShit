#!/bin/bash

file='sys.log'

# ID, username, operation, status, execution Time

id=($(cut -d : -f 1 "$file"))
un=($(cut -d : -f 2 "$file"))
op=($(cut -d : -f 3 "$file"))
st=($(cut -d : -f 4 "$file"))
et=($(cut -d : -f 5 "$file"))

q1=($(cut -d : -f 2,4 "$file" | sort | uniq -c))

for ((i = 0; i < ${#q1[@]}; i++)); do
    echo "$i -> ${q1[$i]}"
done

# for ((i = 0; i < ${#id[@]}; i++)); do
#     echo "Row $i -> ID: ${id[$i]}, User: ${un[$i]}, Status: ${st[$i]}"
# done