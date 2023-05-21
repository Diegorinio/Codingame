import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

def Operation(operation, in1, in2):
    output = ""
    l = len(in1)
    if operation=='AND':
        for x in range(l):
            if in1[x]=='-' and in2[x]=='-':
                output+='-'
            else:
                output+='_'
    if operation=='OR':
        for x in range(l):
            if in1[x]=='_' and in2[x]=='_':
                output+='_'
            else:
                output+='-'
    if operation=='XOR':
        for x in range(l):
            if in1[x]=='_' and in2[x]=='_' or in1[x]=='-' and in2[x]=='-':
                output+='_'
            else:
                output+='-'
    if operation=='NAND':
        for x in range(l):
            if in1[x]=='-' and in2[x]=='-':
                output+='_'
            else:
                output+='-'
    if operation=='NOR':
        for x in range(l):
            if in1[x]=='_' and in2[x]=='_':
                output+='-'
            else:
                output+='_'
    if operation=='NXOR':
        for x in range(l):
            if in1[x]=='_' and in2[x]=='_' or in1[x]=='-' and in2[x]=='-':
                output+='-'
            else:
                output+='_'
    return output

def getOutPut(inputs, outname, operation, gate1, gate2):
    gate1content = ""
    gate2content = ""
    for x in range(len(inputs)):
        if inputs[x][0]==gate1:
            gate1content=inputs[x][1]
        if inputs[x][0]==gate2:
            gate2content=inputs[x][1]
    res = str(Operation(operation, gate1content,gate2content))
    print(outname+" "+res)

n = int(input())
m = int(input())
inputs = []
for i in range(n):
    input_name, input_signal = input().split()
    inputs.insert(i, (input_name+" "+input_signal).split(" "))
for i in range(m):
    output_name, _type, input_name_1, input_name_2 = input().split()
    getOutPut(inputs, output_name, _type, input_name_1, input_name_2)
