public class calcMath {
    public void FizzBuzz (int init, int end){
        while (init<=end){
            if(init%3==0){
                System.out.println("Fizz");
            }
            if(init%5==0){
                System.out.println("Buzz");
            }
            if(init%3==0&&init%5==0){
                System.out.println("FizzBuzz");
            }
        init++;
        }
    }
    public Integer calcFactIter(int factor){
        int result =1;
        for(int i =1;i<=factor;i++){
            result*=i;
        }
        return result;
    }
    public Integer FactorRecursive(int factor){
        if(factor<=0){
            return 0;
        }if(factor==1||factor==0){
            return 1;
        }
        return factor* FactorRecursive(factor-1);
    }
    public Integer calcFiboIter(int number){
        int result=0;
            if (number==2 || number==1) {
                return result;
            }
            for (int i = 2; i < number; i++) {
                result=(i-1)+(i-2);
            }
        return result;
    }
    public Integer calcFibRecursive(int number){
        if (number==2 || number==1) {
            return 1;
        }
        return calcFibRecursive(number-1)+calcFibRecursive(number-2);  
    }
    public void BubbleSort(Number[]array){
        Number aux=0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-2-i; j++) {
                if (array[j].doubleValue()>array[j+1].doubleValue()) {
                    aux = array[j+1];
                    array[j+1]=array[j];
                    array[j]=aux;
                }
            }
        }

    }
  /*Si el tamaño del array es 1 o menos, retornar.
    Seleccionar un pivote.
    Dividir el array en dos subarrays:
        - Menores que el pivote.
        - Mayores que el pivote.
    Ordenar recursivamente ambos subarrays.
    Unir los subarrays y el pivote.
*/
    public void QuickSort(Number[] array){
        
    }
}    
