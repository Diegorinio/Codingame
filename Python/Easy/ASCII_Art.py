import sys
import math


def getPos(mark):
    a = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ?'
    m = mark.upper()
    if m in a:
        return int(a.index(m))
    else:
        return int(len(a)-1)

l = int(input())
h = int(input())
t = input()
for i in range(h):
    row = input()
    line =''
    for ch in t:
        s = getPos(ch)*l
        end = s+l
        line+=row[s:end]
    print(line)
