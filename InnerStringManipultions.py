class StringManipulations:
    def CountVowelS(str: str)->int:
        vowels= ["a","A","e","E","i","I","u","U","o","O",]
        cantvowels = 0
        for i in range(len(str)):
             for j in range(len(vowels)):
                if(str[i]==vowels[j]):
                    cantvowels =cantvowels+1

        return cantvowels
    def invertCapitilez(str: str)->str:
        lowercase,uppercase=str.lower(),str.upper()
        result = ""
        for i in range(len(str)):
            if lowercase[i]== str[i]:
                result= result+uppercase[i]
            else:
                result= result+lowercase[i]                
        return result
    def isPalindrome(str:str)->bool:
        for i in range(len(str)) :
            if str[i]!= str[len(str)-1-i]:
                return False
        return True
    def longestWord(str:str)->str:
        longest = ""
        temp = ""
        for i in range(len(str)):
            currentChar = str[i]
            if currentChar.isalpha:
                
    