diddy() {
    if [ "$#" -eq 0 ]; then
        echo "filename mate! it's important."
        return 1
    fi

    touch "$@" && nano "$@"
}

eddy() {
    [ "$#" -eq 0 ] && { echo "filename mate"; return 1; }
    [ -f "$1" ] || { echo "No such file"; return 1; }
    nano "$1"
}

eddy() {
    if [ "$#" -eq 0 ]; then
        echo "filename mate"
        return 1
    fi

    if [ ! -f "$1" ]; then
        echo "No such file"
        return 1
    fi
}


# Short answer: we could use if … fi.
# We’re not because && / || is cleaner, tighter, and more idiomatic for simple guards.

# Let’s compare.

# Your version (guard-style)
# [ "$#" -eq 0 ] && { echo "filename mate"; return 1; }
# [ -f "$1" ] || { echo "No such file"; return 1; }


# This is called a guard clause.

# Why it’s nice

# Reads top-to-bottom

# Fails early

# No nesting

# Each line handles one rule

# Think of it like:

# “If this is wrong → stop immediately.”

# That’s why it’s common in:

# shell scripts

# C

# Go

# Python

# Rust

# Same logic using if … fi
# if [ "$#" -eq 0 ]; then
#     echo "filename mate"
#     return 1
# fi

# if [ ! -f "$1" ]; then
#     echo "No such file"
#     return 1
# fi

# This is also 100% correct

# But:

# More lines

# More visual noise

# Easier to accidentally nest badly

# When if … fi is better

# Use if when:

# You have multiple commands

# You need elif

# Logic branches in more than 2 directions

# Example:

# if [ -d "$1" ]; then
#     echo "directory"
# elif [ -f "$1" ]; then
#     echo "file"
# else
#     echo "nope"
# fi


# Trying to do that with && || would be cursed.

# Why && / || works here

# Because:

# [ condition ] returns exit code

# && runs next command only if exit = 0

# || runs next command only if exit ≠ 0

# Shell logic is exit-code driven, not boolean-driven like Java.

# So this:

# [ -f "$1" ] || { echo "No such file"; return 1; }


# Literally means:

# “If file check fails → handle error → bail.”

# Rule of thumb (burn this into your brain)

# Validation / early exits → && / ||

# Complex flow → if … fi

# Your eddy() function is exactly the case where guard clauses shine.