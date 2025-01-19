class calcMath:
    def FizzBuzz(init: int, fin:int):
        for init in range(fin):
            if (init%3)==0:
                print("Fizz")
            if (init%5)==0:
                print("Buzz")
            if(init%3)and(init%5):
                print("FizzBuzz")
    
    def calcIter(self,factor: int)->int:
        number = 1
        for i in range(1, factor+1):
            number*= i
        return number

        return result 
    def calcFact(self, n: int) -> int:
        if n < 0:
            raise ValueError("El número debe ser no negativo.")
        if n == 0 or n == 1:
            return 1
        return n * self.calcFact(n - 1)
    
    def numbersTilFib(number:int  )-> int:
        result = []
        if number >= 1:
            result.append(1)
        if number >= 2:
            result.append(1)
        else:
            return result
        for i in range(2,number,1):
            result.append(result[-1]+result[-2])
        return result
    def fibonacci_recursive(self,n: int) -> int:
        if n <= 0:
            raise ValueError("El número debe ser mayor o igual a 1.")
        if n == 1 or n == 2:
            return 1  # Los dos primeros números de Fibonacci son 1
        return self.fibonacci_recursive(n - 1) +self. fibonacci_recursive(n - 2)
