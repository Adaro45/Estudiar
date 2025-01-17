def numberComparation(firstNumber, secondNumber):
    if firstNumber==secondNumber:
        return firstNumber
    elif firstNumber>secondNumber:
        return firstNumber
    else:
        return secondNumber

# print(numberComparation(2.5,2.5))
def MultipleyrTable(number,range):
    result="Number_*_multiplyer = Result"+"\n"
    i=0
    while(i <= range):
        result +=""+str(number)+"*"+str(i)+"="+str(number*i)+"\n"
        i=i+1
    return result
# print(MultipleyrTable(2,100))
def isPrimo(number:int)-> bool:
    for i in range(2,number):
        if number%i == 0:
            return False
    return True
# print(isPrimo(6))
def PrimosTilNumber(firstNumber:int, endNumber:int):
    stack=[]
    if(firstNumber>endNumber):
        return "First Number can't be bigger than end Number"
    for i in range(firstNumber,endNumber):
        if(isPrimo(i)):
            stack.append(i)    
    return stack
# print(PrimosTilNumber(2,10))
def MaxNumber(array):
    max = array[0]
    for i in range(len(array)):
        if array[i]> max:
            max = array[i]
    return max
def MinNumber(array):
    min = array[0]
    for i in range(len(array)):
        if array[i]<min:
            min=array[i]
    return min
# print(MinNumber([1,2,3,4,5]))        
# print(MaxNumber([9,8,7,6]))
def Mean(array):
    mean = 0;
    for i in range(len(array)):
        mean = array[i]+mean
    return mean / len(array)
# print(Mean([1,2,3,4,5]))
def InvertArray(array):
    inverted = []
    for i in range(len(array)-1,-1,-1):
        inverted.append(array[i])
    return inverted
# print(InvertArray([1,2,3,4,5]))
def SortArray(array):
    for i in range(len(array)):
        for j in range(i+1,len(array)):
            if array[i] > array[j]:
                array[i],array[j] = array[j], array[i]

# array = [4,2,3,1,3]
# SortArray(array)
# print(array)
def deleteDuplicate(array):
    i = 0
    while i < len(array):  
        j = i + 1
        while j < len(array):
            if array[i] == array[j]:
                array.pop(j)  
            else:
                j += 1  
        i += 1  
# deleteDuplicate(array)
# print(array)

def FusionArrays(array1, array2):
    array = array1+array2
    SortArray(array)
    return array
array1 = [1,3,5,7]
array2 = [5,3,6,8]
array = FusionArrays(array1,array2)
deleteDuplicate(array)
print(array)