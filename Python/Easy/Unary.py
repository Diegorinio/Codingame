message = input()

# Transform the message in binary, each character being 7-bits long
message_bin = ""
for letter in message:
    bits = bin(ord(letter))[2:] # Strip 0b in front of binary
    message_bin += "0" * (7 - len(bits)) + bits

message_unary = ""
while message_bin:
    if message_bin[0] == '1':
        message_unary += "0 "
    elif message_bin[0] == '0':
        message_unary += "00 "
    
    count = 0
    for char in message_bin:
        if char == message_bin[0]:
            count += 1
        elif char != message_bin[0]:
            break
    
    message_unary += "0" * count
    if count < len(message_bin):
        message_unary += " "
    
    message_bin = message_bin[count:]

print(message_unary)