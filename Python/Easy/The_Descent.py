import sys
import math

light_x, light_y, initial_tx, initial_ty = [int(i) for i in input().split()]
X=initial_tx
Y=initial_ty

# game loop
while True:
    remaining_turns = int(input())  # The remaining amount of turns Thor can move. Do not remove this line.
    if light_x-X>0 and Y==light_y:
        print("E")
        X+=1
    elif light_x-X<0 and Y==light_y:
        print("W")
        X-=1
    if light_y-Y >0 and X==light_x:
        print("S")
        Y+=1
    elif light_y-Y < 0 and X==light_x:
        print("N")
        Y-=1
    if X<light_x and Y<light_y:
        print("SE")
        Y+=1
        X+=1
    elif X > light_x and Y<light_y:
        print("SW")
        X-=1
        Y+=1
