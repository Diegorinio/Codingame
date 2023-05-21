import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

n = int(input())
powers = []
id=0
for i in range(n):
    pi = int(input())
    powers.insert(id, pi)
    id+=1
powers.sort()
id=1
diffs = []
for i in range(n):
    if i>0:
        diffs.insert(id, powers[i]-powers[i-1])
    id+=1

print(min(diffs))
