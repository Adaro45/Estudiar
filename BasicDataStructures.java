import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BasicDataStructures implements InnerBasicDataStructures {
    public  Number numberComparation(Number firstNumber, Number secondNumber) {
        if (firstNumber==secondNumber)
            return  firstNumber;
        if (firstNumber.doubleValue() > secondNumber.doubleValue())
            return firstNumber;
        else
            return secondNumber;
    }
    public  String MultiplyTable(int number, int range){
        String table = "Number_*_multiplyer = Result"+"\n";
        for(int i= 1; i<=range;i++){
            table +="   "+number+"   *       "+i+"    =   "+number*i+"\n";
        }
        return table;
    }
    public  Boolean isPrimo(int number){
        for(int i =2; i< number;i++){
            if(number%i == 0){
                return false;
            }
        }
        
        return true;
    }
    public  Stack<Integer> PrimosTilNumber(int number, int endNumber) throws ExceptionFirstNumberBigger{
        Stack<Integer> primos= new Stack<>();     
        if(number>endNumber){
        throw new ExceptionFirstNumberBigger("First element can't be bigger than endNumber");
        }
        for(int i = number; i<=endNumber;i++){
                if (isPrimo(i)){
                    primos.push(i);
                }
        }
        return primos;
    }
    public  Number MaxNumber(Number[] array){
        Number max = array[0];
        for (int i = 0;i<array.length;i++ ) {
            max = numberComparation(i, max);
        }
        return max;
    }
    public  Number MinNumber(Number[] array){
        Number min = array[0];
        for (int i = 0; i< array.length; i++) {
            numberComparation(min, i);
        }
        return min;
    }
    public  Double Mean(Number[]array){
        double mean = 0;
        for (int i = 0;i< array.length;i++) {
            mean += array[i].doubleValue();
        }
        mean /=array.length;
        return mean;
    }
    public  Stack<Number> InvertArray(Number[]array){
        Stack<Number> inverted = new Stack<>();
        for(int i=array.length-1; i>= 0; i--){
                 inverted.push(array[i]);
            }
        return inverted;
    }
    public  Number[] SortArray(Number[] array){
            Number aux = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j =0; j < array.length; j++) {
                    if(array[i].doubleValue() <  array[j].doubleValue()){
                        aux = array[j];
                        array[j] = array[i];
                        array[i] = aux;
                    }
                }
            }
        return array;
    }
    public  ArrayList<Number> DeleteDuplicatedValues(Number[]array){
        ArrayList<Number> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);
        int i = 0;
        int j = 0;
            while (i<arrayList.size()) {
                j=i+1;
                while (j<arrayList.size()) {
                    if(arrayList.get(i)==arrayList.get(j)){
                        arrayList.remove(i);
                    }else{       
                        j++;
                    }
                }
                i++;
            }
        return arrayList;
    }    
    public  Number[] FusionArrays(Number[]array1, Number[]array2){
        Number[] array = new Number[array1.length+array2.length];
        System.arraycopy(array1, 0, array, 0, array1.length);
        System.arraycopy(array2,0, array, array1.length, array2.length);
        array=SortArray(array);
        return array;
    }
    
}
