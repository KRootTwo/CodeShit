#!/bin/bash

wc=$'\n==== STUDENT ATTENDANCE SYSTEM ====\n1. Show Students\n2. Mark Attendance\n3. Show Attendance\n4. Check Attendance Status\n5. Exit\n'

printf '%b' "$wc"
echo

read -p "Enter choice: " c

studs=("Rahul" "Priya" "Amit" "Sneha" "Rohan")
attd=(0 0 0 0 0)


show_students() {
    echo "Student Names:- "
    echo
    id=1
    for i in "${studs[@]}"
    do
        echo "$id. $i"
        ((id++))
    done
}

mark_attendance() {

}







echo

case "$c" in 
    1)
        show_students
        ;;
    2)
        echo "Mark Attendance"
        ;;
    3)
        echo "Show Attendance"
        ;;
    4)
        echo "Check Attendance Status"
        ;;
    5) 
        echo "Exiting..."
        exit 0
        ;;
    *) 
        echo "Invalid choice"
        exit 1
        ;;
esac