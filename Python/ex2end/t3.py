def fibonacci_rec (n) :
    if n <= 0 :
        return 0
    elif n == 1 :
        return 1
    else :
        return fibonacci_rec (n - 1) + fibonacci_rec (n - 2)

def fibonacci_ite (n) :
    if n <= 0 : 
        return 0
    elif n == 1 :
        return 1

    prev1 = 1
    prev2 = 0

    for _ in range (2, n + 1) :
        current = prev1 + prev2
        prev2 = prev1
        prev1 = current
        
    return prev1