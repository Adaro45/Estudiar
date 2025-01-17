import java.util.ArrayList;
import java.util.Stack;
public interface InnerBasicDataStructures {
    Number numberComparation(Number firstNumber, Number secondNumber);
    String MultiplyTable(int number, int range);
    Boolean isPrimo(int number)throws ExceptionFirstNumberBigger;
    Number MaxNumber(Number[] array);
    Number MinNumber(Number[] array);
    Double Mean(Number[] array);
    Stack<Number> InvertArray(Number[] array);
    Number[] SortArray(Number[] array);
    ArrayList<Number> DeleteDuplicatedValues(Number[] array);
    Number[] FusionArrays(Number[]array1, Number[]array2);
    
    }