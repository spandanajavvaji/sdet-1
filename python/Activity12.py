def calculatesum(num):
    if num:
        return (num+calculatesum(num-1))
    else:
        return 0

result = calculatesum(10)
print (result)

