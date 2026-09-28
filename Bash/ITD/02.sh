#!/bin/bash

echo

read -p "Enter a number: " num

if (( 10#$num > 0 && (10#$num & (10#$num - 1)) == 0 ))
then
    echo "$num is power of 2"
else
    echo "$num is not power of 2"
fi

echo