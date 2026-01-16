### Recursions ###

## Factorial ##
def fact(n) :
    if n == 0:
        return 1
    else :
        return n * fact(n - 1)

## print 1 to n ##
def p1tn(n):
    if n == 0 :
        return
    p1tn(n - 1)
    print(n)

## print n to 1 ##
def pnt1(n):
    if n == 0:
        return
    else :
        print(n)
        pnt1(n - 1)

## sum of first n ##
def fnsum(n):
    if n == 0 :
        return 1
    else :
        return n + fnsum(n - 1)

## fibonacci ##
def fib(n) :
    if n <= 1:
        return n
    return fib(n - 1) + fib(n - 2)

## print digits ##
def prdg(n):
    if n == 0 :
        return
    prdg(n // 10)
    print(n % 10)

## count digits ## 
def ctdg(n) :
    if n == 0 :
        return 0
    return 1 + ctdg(n // 10)

## sum of digits ##
def smdg(n) :
    if n == 0 :
        return 0
    return (n % 10) + smdg(n // 10)

## reverse a string ##
def revstr(s) :
    if len(s) == 0:
        return ""
    return revstr(s[1:]) + s[0]

## palindrome ##
def pal(s) :
    if len(s) <= 1 :
        return True
    if s[0] != s[-1] :
        return False
    return (pal(s[1:-1]))

print(fact(5))

