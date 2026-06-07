import time
from collections import Counter 
import random

def mos_frec (lst) :
    if not lst :
        return None, 0

    mos_com_elem, count = freq_map.most_common(1)[0]

    return mos_com_elem, count


# main

l1 = [random.randint(1, 100) for _ in range (10000000)]

start = time.perf_counter()

ele, freq = mos_frec (l1)
print(ele, " ", freq)

end = time.perf_counter()

print (end - start)










'''

    mos_com_elem, count = freq_map.most_common(1)[0]
                    number of element i need---^  ^--- tuple unpacking



'''