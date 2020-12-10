numlist = list(input('enter the numbers in the list seperated by comma: ').split(","))
print("given list is ", numlist)

firstelement = numlist[0]
lastelement = numlist[-1]

if firstelement == lastelement:
    print('True') 
else:
    print('False')  