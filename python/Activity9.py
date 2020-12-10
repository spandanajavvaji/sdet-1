list1 = [2, 4, 23, 39,42, 13, 5]
list2 = [31, 45, 22, 33, 98, 27, 51]

print("firstlist: ", list1)
print("second list: ", list2)
thirdlist = []
for num in list1:
    if (num % 2 != 0):
        thirdlist.append(num)
for num in list2:
    if (num%2 == 0):
        thirdlist.append(num)
print("result list is: ", thirdlist)
