l1 = [1, 2,3 ,4 , 5, 6, 7, 8]
l2 = [7, 8, 9, 0, 3]
l3 =[]

l3 = [i for i in l1 if i not in l2]

# for i in l1 :
#     if i not in l2 :
#         l3.append(i)

print(l3)