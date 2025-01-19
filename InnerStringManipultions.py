class StringManipulations:
    def CountVowelS(str: str)->int:
        vowels = ["a","A","e","E","i","I","u","U","o","O",]
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
            if currentChar.isalpha():
                temp += currentChar
            elif len(temp) > len(longest):
                longest = temp
            if currentChar==" ":
                temp = ""

        if len(temp) > len(longest):
            longest=temp
        return longest
    def isVowel(self, char: str) -> bool:
        if len(char) != 1: 
            raise ValueError("El argumento debe ser un único carácter.")
        vowels = {"a", "A", "e", "E", "i", "I", "u", "U", "o", "O"}  
        return char in vowels
    def replaceVowelXCharacter(self, string, replacer) -> str:
        if len(replacer) != 1:  # Validar que el reemplazo sea un solo carácter
            raise ValueError("El reemplazo debe ser un único carácter.")
        result = []
        for i in range(len(string)):
            if self.isVowel(string[i]):  
                result.append(replacer) 
            else:
                result.append(i)  
        
        return result  
    