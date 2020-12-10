def calculatesum(numbers):
    sum=0
    for number in numbers:
        sum = sum+number
    return sum
numList = [10,20,43,89,98]
result = calculatesum(numList)
print (result)