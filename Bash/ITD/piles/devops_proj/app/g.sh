#!/bin/bash

# a="lol.txt"

# read -p "fuhh: " num

# echo $((num))

# [ $num -gt 10 ] && echo "BIGG" || echo "smol"

# read -p "shh: " num

# if [[ num > 40 && num < 100 ]]
# then
# echo "BIGG"
# elif [[ num > 100 ]]
# then
# echo "Retard"
# else 
# echo "smol"
# fi


# if [[ $((num % 2)) == 0 ]] 
# then
# echo "fn"
# fi

# for i in 1 2 3 4 5
# do 
# echo $i
# done

# for i in {1..10}
# do 
# echo "$num x $i = $((num * i))"
# done

# n=9
# while [[ $n > 0 ]]
# do
# echo $n
# ((n--))
# done

# for file in *.txt
# do
# echo "$file"
# done


# for i in *
# do
# if [[ -f "$i" ]]
# then
# echo "$i -- file"
# elif [[ -d "$i" ]]
# then
# echo "$i -- dirr"
# fi
# done

# stu=(1 2 3 4)

# echo "${stu[@]}"

# n=1

# case $n in
# 1)
# echo a
# ;;
# 2)
# echo b
# ;;
# esac

# for (( i=0; i <5; i++ ))
# do 
# echo $i
# done

i=5
until [[ $i < 1 ]]
do 
echo $i
i=$((i-1))
done