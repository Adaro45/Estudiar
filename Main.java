import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws ExceptionFirstNumberBigger {
        // InnerBasicDataStructures BDS = new BasicDataStructures();
        // Integer [] array = {1,2,3,3,4,5,6};
        // Double []array2 = {1.0,2.7,4.5};
        // System.out.println(MultiplyTable(2,100));
        // System.out.println(isPrimo(34));
        // System.out.println((PrimosTilNumber(1, 10)).toString());
        // System.out.println(numberComparation(2, 1));
        // System.out.println(MaxNumber(array));
        // System.out.println(MinNumber(array));
        // System.out.println(Mean(array));
        // System.out.println(InvertArray(array));
        // System.out.println(Arrays.toString(SortArray(array)));
        // System.out.println(DeleteDuplicatedValues(array).toString());
        // System.out.println(Arrays.toString(FusionArrays(array, array2)));
        // InnerStringManipulations ism = new StringManipulations();
        // String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        // System.out.println(ism.CountVowels(str));
        // String inverted = ism.invertCapitalize(str);
        // System.out.println(inverted);
        // System.out.println(ism.isPalindrome("ab654ba"));
        // System.out.println(ism.longestWord(str));
        // System.out.println(ism.replaceVowelsXCharacter(str,'*'));
        
        calcMath cm = new calcMath();
        // cm.FizzBuzz(1, 15);
        // System.out.println(cm.calcFactIter(3));
        // System.out.println(cm.FactorRecursive(5));
        // System.out.println(cm.calcFiboIter(5));
        // System.out.println(cm.calcFibRecursive(5));
        Number [] array ={5,3,2,6,1,4};
        cm.BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
