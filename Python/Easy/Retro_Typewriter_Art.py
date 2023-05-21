import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
def getString(s):
    mark = ""
    string=""
    if "sp" in s or "bS" in s or "sQ" in s or "nl" in s:
        mark = s[len(s)-2: len(s)]
        num= s[0:len(s)-2]
        if mark=="sp":
            mark=" "
        if mark=="bS":
            mark="\\"
        if mark=="sQ":
            mark="'"
        if mark=="nl":
            mark="\n"
    elif len(s)>2:
        mark = s[len(s)-1:len(s)]
        num = int(s[0:len(s)-1])
    else:
        mark = s[len(s)-1:len(s)]
        num = int(s[0:len(s)-1])
    
    if(num!=""):
        x = int(num)
        for d in range(x):
            string+=mark
    else:
        string+=mark
    return string


t = input()
recipe = t.split(" ")
res = ""
for s in recipe:
    res+=getString(s)
print(res)