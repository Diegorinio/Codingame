import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

def nextEl(n):
    res=0
    for d in str(n):
        res+=int(d)
    return n+res
r_1 = int(input())
r_2 = int(input())
lake1 = []
lake1.insert(0, r_1)
lake2 = []
lake2.insert(0, r_2)
for x in range(1,100000):
    lake1.insert(x, nextEl(lake1[x-1]))

for x in range(1,100000):
    lake2.insert(x, nextEl(lake2[x-1]))
print(lake1, file=sys.stderr, flush=True)
print(lake2, file=sys.stderr, flush=True)
for x in lake1:
    if x in lake2:
        print(x)
        break
