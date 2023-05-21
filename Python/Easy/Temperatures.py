import sys
import math
import array

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
def getClosestToZero(data):
    tmp=0
    h_tmp=0
    if(len(data)> 0):
        tmp=data[0]
        h_tmp=data[len(data)-1]
    for i in range(len(data)-1):
        if(data[i]>tmp and data[i]<=0):
            tmp=data[i]
        if(data[i]<h_tmp and data[i]>=0):
            h_tmp = data[i]
    if(tmp>h_tmp):
        print(tmp)
    elif tmp==0 and h_tmp==0:
        print(0)
    else:
        print(h_tmp)
n = int(input())  # the number of temperatures to analyse
temperatures = [n]
pos=0
for i in input().split():
    # t: a temperature expressed as an integer ranging from -273 to 5526
    t = int(i)
    temperatures.insert(pos, t)
    pos+=1
temperatures.pop()
temperatures.sort()
getClosestToZero(temperatures)