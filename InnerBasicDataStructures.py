class InnerBasicDataStructures:
    def numberComparation(self,firstNumber, secondNumber):
        if firstNumber==secondNumber:
            return firstNumber
        elif firstNumber>secondNumber:
            return firstNumber
        else:
            return secondNumber
    def MultipleyrTable(self,number,range):
        result="Number_*_multiplyer = Result"+"\n"
        i=0
        while(i <= range):
            result +=""+str(number)+"*"+str(i)+"="+str(number*i)+"\n"
            i=i+1
        return result
    def isPrimo(self,number:int)-> bool:
        for i in range(2,number):
            if number%i == 0:
                return False
        return True
    def PrimosTilNumber(self,firstNumber:int, endNumber:int):
        stack=[]
        if(firstNumber>endNumber):
            return "First Number can't be bigger than end Number"
        for i in range(firstNumber,endNumber):
            if(self.isPrimo(i)):
                stack.append(i)    
        return stack
    def MaxNumber(self,array):
        max = array[0]
        for i in range(len(array)):
            if array[i]> max:
                max = array[i]
        return max
    def MinNumber(self,array):
        min = array[0]
        for i in range(len(array)):
            if array[i]<min:
                min=array[i]
        return min
    def Mean(self,array):
        mean = 0;
        for i in range(len(array)):
            mean = array[i]+mean
        return mean / len(array)
    def InvertArray(self,array):
        inverted = []
        for i in range(len(array)-1,-1,-1):
            inverted.append(array[i])
        return inverted
    def deleteDuplicate(self,array):
        i = 0
        while i < len(array):  
            j = i + 1
            while j < len(array):
                if array[i] == array[j]:
                    array.pop(j)  
                else:
                    j += 1  
            i += 1  
    def SortArray(self,array):
        for i in range(len(array)):
            for j in range(i+1,len(array)):
                if array[i] > array[j]:
                    array[i],array[j] = array[j], array[i]
    def FusionArrays(self,array1, array2):
        array = array1+array2
        self.SortArray(array)
        return array
